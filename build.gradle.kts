plugins {
    id("java")
    id("java-library")
    kotlin("jvm") version "2.4.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.ultreon.dev/releases")
    maven("https://maven.ultreon.dev/snapshots")

    mavenLocal()
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(25))
    }

    withSourcesJar()
    withJavadocJar()
}

sourceSets {
    create("client") {
        compileClasspath += sourceSets.main.get().output
        runtimeClasspath += sourceSets.main.get().output
    }
}

dependencies {
    "clientImplementation"(libs.quantumvoxel.client)
    api(libs.quantumvoxel.server)
    api(libs.quantumvoxel.gameprovider)

    implementation("net.fabricmc:fabric-language-kotlin:1.13.12+kotlin.2.4.0")
}
tasks.processResources {
    inputs.property("version", project.version)
    inputs.property("quantumvoxel_version", libs.quantumvoxel.client.get().version)

    filesMatching("fabric.mod.json") {
        expand(mutableMapOf(
                "version" to project.version,
                "quantumvoxel_version" to libs.quantumvoxel.client.get().version
        ))
    }
}

tasks.jar {
    from(sourceSets.named("client").get().output)
}

mkdir("run/")
