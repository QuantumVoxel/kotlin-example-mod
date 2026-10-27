package org.example.client

import net.fabricmc.api.ClientModInitializer
import org.example.ExampleMod

object ExampleModClient : ClientModInitializer {
    override fun onInitializeClient() {
        ExampleMod.LOGGER.info("Hello from Client!")
    }
}