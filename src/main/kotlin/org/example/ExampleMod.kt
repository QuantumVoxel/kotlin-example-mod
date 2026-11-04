package org.example

import net.fabricmc.api.ModInitializer
import net.fabricmc.loader.impl.FabricLoaderImpl.MOD_ID
import net.quantumvoxel.util.Key
import org.example.init.ModBlocks
import org.example.init.ModItems
import org.slf4j.Logger
import org.slf4j.LoggerFactory

object ExampleMod : ModInitializer {
    const val MOD_ID = "examplemod"

    @JvmField
    val LOGGER: Logger = LoggerFactory.getLogger("ExampleMod")

    override fun onInitialize() {
        LOGGER.info("Hello from Fabric!")

        ModBlocks.init()
        ModItems.init()
    }

    fun key(name: String) : Key {
        return Key(MOD_ID, name)
    }
}