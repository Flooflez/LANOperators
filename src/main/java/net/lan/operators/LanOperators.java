package net.lan.operators;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.lan.operators.commands.LanDeOpCommand;
import net.lan.operators.commands.LanOpCommand;

public class LanOperators implements ModInitializer {

	@Override
	public void onInitialize() {
		CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) ->
		{
			LanOpCommand.register(dispatcher);
			LanDeOpCommand.register(dispatcher);
		});
	}
}
