package com.example.quantmod.init

import com.example.quantmod.ExampleMod
import dev.ultreon.quantum.block.Block
import dev.ultreon.quantum.registry.DeferRegistry
import dev.ultreon.quantum.registry.DeferredElement
import dev.ultreon.quantum.registry.Registries

object ModBlocks {
    private val registry: DeferRegistry<Block> = DeferRegistry.of(ExampleMod.MOD_ID, Registries.BLOCK)

    val exampleBlock: DeferredElement<Block> = registry.defer("example_block", ::Block)

    fun register() {
        registry.register()
    }
}