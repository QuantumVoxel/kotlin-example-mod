package com.example.quantmod.client

import com.example.quantmod.exampleMod
import com.example.quantmod.init.ModBlocks
import dev.ultreon.quantum.client.api.events.ClientRegistrationEvents
import dev.ultreon.quantum.client.model.block.BlockModelRegistry
import dev.ultreon.quantum.client.model.block.CubeModel
import net.fabricmc.api.ClientModInitializer

object ExampleModClient : ClientModInitializer {
  override fun onInitializeClient() {
    ClientRegistrationEvents.BLOCK_MODELS.subscribe {
      BlockModelRegistry.get().register(ModBlocks.exampleBlock, { true }) {
        CubeModel.of("blocks/example_block".exampleMod, "blocks/example_block".exampleMod)
      }
    }
  }
}