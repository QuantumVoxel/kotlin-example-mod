package org.example

object ExampleHooks {
    fun onCommonInit() {
        ExampleMod.LOGGER.info("Hello from Mixin!")
    }
}