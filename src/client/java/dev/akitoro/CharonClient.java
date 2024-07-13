package dev.akitoro;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.HudRenderCallback;
import net.minecraft.client.MinecraftClient;

public class CharonClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		// This entrypoint is suitable for setting up client-specific logic, such as rendering.
		HudRenderCallback.EVENT.register((drawContext, tickCounter) -> {
			MinecraftClient client = MinecraftClient.getInstance();
			drawContext.drawText(client.textRenderer, "Hello World", 10, 200, 0xFFFFFFFF, false);
		});
	}
}