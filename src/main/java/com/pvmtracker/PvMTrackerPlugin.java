package com.pvmtracker;

import com.google.inject.Provides;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.ChatMessageType;
import net.runelite.api.Client;
import net.runelite.api.GameState;
import net.runelite.api.events.GameStateChanged;
import net.runelite.client.config.ConfigManager;
import net.runelite.client.eventbus.Subscribe;
import net.runelite.client.plugins.Plugin;
import net.runelite.client.plugins.PluginDescriptor;

@Slf4j
@PluginDescriptor(
	name = "PvM Performance Tracker"
)
public class PvMTrackerPlugin extends Plugin
{
	// static fields
	public static final String PLUGIN_VERSION = "0";
	@Inject
	private Client client;

	@Inject
	private PvMTrackerConfig config;

	@Override
	protected void startUp() throws Exception
	{
		log.info("PvM Tracker started!");
	}

	@Override
	protected void shutDown() throws Exception
	{
		log.info("PvM Tracker stopped!");
	}

	@Subscribe
	public void onGameStateChanged(GameStateChanged gameStateChanged)
	{
		if (gameStateChanged.getGameState() == GameState.LOGGED_IN)
		{
			//client.addChatMessage(ChatMessageType.GAMEMESSAGE, "", "Example says " + config.greeting(), null);
		}
	}

	@Provides
	PvMTrackerConfig provideConfig(ConfigManager configManager)
	{
		return configManager.getConfig(PvMTrackerConfig.class);
	}
}
