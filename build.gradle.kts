plugins {
    id("java")
    id("java-library")
    id("net.quantumvoxel.photon") version "0.1.0-SNAPSHOT"
    kotlin("jvm") version "2.4.0"
}

group = "org.example"
version = "1.0-SNAPSHOT"

photon {
    gameVersion = "0.1.0-alpha.2026.11.03"
    splitClientSources = true
    generateSources = true
    generateJavadoc = true
}

dependencies {
    api("net.fabricmc:fabric-language-kotlin:1.13.12+kotlin.2.4.0")
}
