package com.example.craft.mod

import com.example.craft.mod.init.ModBlocks
import com.example.craft.mod.init.ModItems
import dev.ultreon.quantum.ModInit
import dev.ultreon.quantum.events.PlayerEvents
import dev.ultreon.quantum.server.player.ServerPlayer
import dev.ultreon.quantum.text.TextObject
import dev.ultreon.quantum.text.TextStyle
import dev.ultreon.quantum.util.RgbColor

class ExampleMod : ModInit {
    override fun onInitialize() {
        ModBlocks.register()
        ModItems.register()

        PlayerEvents.PLAYER_JOINED.subscribe { player ->
            player.sendMessage(TextObject.literal("Hello, world!").style { style ->
                style.color(RgbColor.rgb(0xff0000))
            })
        }
    }

    companion object {
        const val MOD_ID: String = "example_mod"
    }
}