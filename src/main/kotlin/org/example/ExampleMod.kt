package org.example

import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import org.slf4j.LoggerFactory

class ExampleMod : ModInitializer {
    public override fun onInitialize() {
        LOGGER.info("Hello from Fabric!")
    }

    companion object {
        @JvmField
        val LOGGER: Logger = LoggerFactory.getLogger("ExampleMod")
    }
}