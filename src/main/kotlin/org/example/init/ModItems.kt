package org.example.init

import net.quantumvoxel.block.Block
import net.quantumvoxel.item.BlockItem
import net.quantumvoxel.item.Item
import net.quantumvoxel.item.category.ItemCategories
import net.quantumvoxel.registry.Registries
import org.example.ExampleMod

object ModItems {
    val exampleBlock = register("example_block", BlockItem(Item.Settings(), ModBlocks::exampleBlock))

    private fun <T : Item> register(name: String, block: T): T {
        Registries.ITEM.register(ExampleMod.key(name), block)
        return block
    }

    fun init() {
        ItemCategories.BUILDING.addContent(exampleBlock)
    }
}