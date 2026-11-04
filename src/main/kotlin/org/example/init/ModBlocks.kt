package org.example.init

import net.quantumvoxel.block.Block
import net.quantumvoxel.registry.Registries
import org.example.ExampleMod

object ModBlocks {
    val exampleBlock = register("example_block", Block(Block.Settings().strength(1.5f)))

    private fun <T : Block> register(name: String, block: T): T {
        Registries.BLOCK.register(ExampleMod.key(name), block)
        return block
    }

    fun init() {

    }
}