package org.example.client.mixins;

import net.quantumvoxel.client.gui.screen.TitleScreen;
import org.example.client.ExampleClientHooks;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
    @Inject(method = "init", at = @At("HEAD"))
    private void init(CallbackInfo ci) {
        ExampleClientHooks.INSTANCE.onTitleScreenInit();
    }
}
