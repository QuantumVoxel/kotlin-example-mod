package com.example.quantmod.init

import com.example.quantmod.ExampleMod
import dev.ultreon.quantum.item.BlockItem
import dev.ultreon.quantum.item.Item
import dev.ultreon.quantum.registry.DeferRegistry
import dev.ultreon.quantum.registry.DeferredElement
import dev.ultreon.quantum.registry.Registries
import dev.ultreon.quantum.item.Item.Properties as ItemProperties

object ModItems {
    private val registry: DeferRegistry<Item> = DeferRegistry.of(ExampleMod.MOD_ID, Registries.ITEM)

    val exampleBlock: DeferredElement<Item> = registry.defer("example_block") {
        BlockItem(ItemProperties()) { ModBlocks.exampleBlock.get() }
    }

    fun register() {
        registry.register()
    }
}