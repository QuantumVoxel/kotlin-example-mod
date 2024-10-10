package com.example.quantmod

import com.example.quantmod.init.ModBlocks
import com.example.quantmod.init.ModItems
import dev.ultreon.quantum.events.PlayerEvents
import dev.ultreon.quantum.text.TextObject
import dev.ultreon.quantum.util.NamespaceID
import dev.ultreon.quantum.util.RgbColor
import net.fabricmc.api.ModInitializer

val String.exampleMod: NamespaceID
    get() = NamespaceID(ExampleMod.MOD_ID, this)

object ExampleMod : ModInitializer {
    const val MOD_ID: String = "example_mod"

    override fun onInitialize() {
        ModBlocks.register()
        ModItems.register()

        PlayerEvents.PLAYER_JOINED.subscribe { player ->
            player.sendMessage(TextObject.literal("Hello, world!").style { style ->
                style.color(RgbColor.rgb(0xff0000))
            })
        }
    }
}