package com.pvmtracker;

import net.runelite.client.config.*;

@ConfigGroup("pvmtracker")
public interface PvMTrackerConfig extends Config
{
	int MIN_LEVEL = 1;
	int MAX__LEVEL = 120;

	// ==== Config Sections ====

	@ConfigSection(
			name = "Overlay",
			description = "Contains overlay settings.",
			position = 0,
			closedByDefault = true
	)
	String overlay = "overlay";

	@ConfigSection(
			name = "Levels",
			description = "Contains level settings.",
			position = 50,
			closedByDefault = false
	)
	String levels = "levels";

	// ==== General ====
	@ConfigItem(
		keyName = "pluginVersion",
		name = "Plugin Version",
		description = "Hidden plugin version",
		hidden = true
	)
	default String pluginVersion()
	{
		return PvMTrackerPlugin.PLUGIN_VERSION;
	}
	@ConfigItem(
			keyName = "showFightHistoryPanel",
			name = "Show Fight History Panel",
			description = "Enables the side panel which displays previous fight statistics.",
			position = -1
	)
	default boolean showFightHistoryPanel()
	{
		return true;
	}

	// ==== Overlay Config ====

	@ConfigItem(
			keyName = "showOverlay",
			name = "Show Overlay",
			description = "Display your fight statistics during the fight on screen.",
			position = 0
	)
	default boolean showOverlay()
	{
		return true;
	}

	@ConfigItem(
			keyName = "showOverlayNames",
			name = "Show Names in Overlay",
			description = "The overlay will display names.",
			position = 10
	)
	default boolean showOverlayNames()
	{
		return true;
	}

	@ConfigItem(
			keyName = "showOverlayDeservedDamage",
			name = "Show Deserved Damage in Overlay",
			description = "The overlay will display deserved damage.",
			position = 20
	)
	default boolean showOverlayDeservedDamage()
	{
		return true;
	}

	@ConfigItem(
			keyName = "showOverlayDamageDealt",
			name = "Show Damage Dealt in Overlay",
			description = "The overlay will display damage dealt.",
			position = 30
	)
	default boolean showOverlayDamageDealt()
	{
		return true;
	}

	@ConfigItem(
			keyName = "showLongestZeroStreak",
			name = "Show Longest Zero Streak",
			description = "The overlay will display your longest streak of 0 hits.",
			position = 40
	)
	default boolean showLongestZeroStreak()
	{
		return true;
	}

	// ==== Levels Config ====

	@Range(
			min = MIN_LEVEL,
			max = MAX__LEVEL
	)
	@ConfigItem(
			keyName = "attackLevel",
			name = "Attack Level",
			description = "Attack level used for deserved damage calculations.",
			position = 60,
			section = levels
	)
	default int attackLevel()
	{
		return 99;
	}

	@Range(
			min = MIN_LEVEL,
			max = MAX__LEVEL
	)
	@ConfigItem(
			keyName = "strengthLevel",
			name = "Strength Level",
			description = "Strength level used for deserved damage calculations.",
			position = 70,
			section = levels
	)
	default int strengthLevel()
	{
		return 99;
	}

	@Range(
			min = MIN_LEVEL,
			max = MAX__LEVEL
	)
	@ConfigItem(
			keyName = "defenceLevel",
			name = "Defence Level",
			description = "Defence level used for deserved damage calculations.",
			position = 80,
			section = levels
	)
	default int defenceLevel()
	{
		return 99;
	}

	@Range(
			min = MIN_LEVEL,
			max = MAX__LEVEL
	)
	@ConfigItem(
			keyName = "rangedLevel",
			name = "Ranged Level",
			description = "Ranged level used for deserved damage calculations.",
			position = 90,
			section = levels
	)
	default int rangedLevel()
	{
		return 99;
	}

	@Range(
			min = MIN_LEVEL,
			max = MAX__LEVEL
	)
	@ConfigItem(
			keyName = "magicLevel",
			name = "Magic Level",
			description = "Magic level used for deserved damage calculations.",
			position = 100,
			section = levels
	)
	default int magicLevel()
	{
		return 99;
	}

	// ==== Miscellaneous Config ====

	@Range(
			min = 1,
			max = 1000
	)
	@ConfigItem(
			keyName = "fightHistoryRenderLimit",
			name = "Max Rendered Fights",
			description = "Maximum number of previous fights that can be displayed in the fight history." +
					"<br>Will cause game lag at extremely large numbers.",
			position = 110
	)
	default int fightHistoryRenderLimit()
	{
		return 200;
	}
}
