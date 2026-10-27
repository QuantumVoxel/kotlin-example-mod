package org.example

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object ExampleMod : ModInitializer {
    @JvmField
    val LOGGER: Logger = LoggerFactory.getLogger("ExampleMod")

    override fun onInitialize() {
        LOGGER.info("Hello from Fabric!")
    }
}