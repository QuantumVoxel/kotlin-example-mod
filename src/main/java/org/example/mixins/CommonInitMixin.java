package org.example.mixins;

import net.quantumvoxel.CommonInit;
import org.example.ExampleHooks;
import org.example.ExampleMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(CommonInit.class)
public class CommonInitMixin {
    @Inject(method = "init", at = @At("HEAD"))
    private static void init(CallbackInfo ci) {
        ExampleHooks.INSTANCE.onCommonInit();
    }
}
