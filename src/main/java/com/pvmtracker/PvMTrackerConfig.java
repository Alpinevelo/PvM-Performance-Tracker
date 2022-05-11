package com.pvmtracker;

import net.runelite.client.config.*;

@ConfigGroup("pvmtracker")
public interface PvMTrackerConfig extends Config
{
	int MIN_LEVEL = 1;
	int MAX_LEVEL = 120;

	// ==== Config Sections ====

	@ConfigSection(
			name = "History Panel",
			description = "Contains panel settings.",
			position = 0,
			closedByDefault = false
	)
	String panel = "panel";

	@ConfigSection(
			name = "Combat Stats",
			description = "Contains combat stat settings.",
			position = 50,
			closedByDefault = false
	)
	String cbtStats = "cbtStats";

	// ==== Panel Config ====

	@ConfigItem(
			keyName = "showPanelDeservedDamage",
			name = "Show Deserved Damage",
			description = "The panel will display deserved damage.",
			position = 20,
			section = panel
	)
	default boolean showPanelDeservedDamage()
	{
		return true;
	}

	@ConfigItem(
			keyName = "showPanelDamageDealt",
			name = "Show Damage Dealt",
			description = "The panel will display damage dealt.",
			position = 30,
			section = panel
	)
	default boolean showPanelDamageDealt()
	{
		return true;
	}

	@ConfigItem(
			keyName = "trackCurrentZeros",
			name = "Track Current Zero Streak",
			description = "Starting from the first zero since last successfully hitting, " +
					"<br>track the current streak of zeros hit.",
			position = 40,
			section = panel
	)
	default boolean trackCurrentZeros() { return true; }
	@ConfigItem(
			keyName = "showLongestZeroStreak",
			name = "Show Longest Zero Streak",
			description = "The panel will display your longest streak of 0 hits.",
			position = 50,
			section = panel
	)
	default boolean showLongestZeroStreak()
	{
		return true;
	}

	@ConfigItem(
			keyName = "trackCurrentHits",
			name = "Track Current Hit Streak",
			description = "Starting from the first hit since the last zero, " +
					"<br>track the current streak of successful hits.",
			position = 60,
			section = panel
	)
	default boolean trackCurrentHits()
	{
		return true;
	}
	@ConfigItem(
			keyName = "showLongestHitStreak",
			name = "Show Longest Hit Streak",
			description = "The panel will display your longest streak of successful hits.",
			position = 70,
			section = panel
	)
	default boolean showLongestHitStreak() {return true;}

	// ==== Levels Config ====

	@Range(
			min = MIN_LEVEL,
			max = MAX_LEVEL
	)
	@ConfigItem(
			keyName = "attackLevel",
			name = "Attack Level",
			description = "Your Attack level.",
			position = 60,
			section = cbtStats
	)
	default int attackLevel()
	{
		return 99;
	}

	@Range(
			min = MIN_LEVEL,
			max = MAX_LEVEL
	)
	@ConfigItem(
			keyName = "strengthLevel",
			name = "Strength Level",
			description = "Your Strength level.",
			position = 70,
			section = cbtStats
	)
	default int strengthLevel()
	{
		return 99;
	}

	@Range(
			min = MIN_LEVEL,
			max = MAX_LEVEL
	)
	@ConfigItem(
			keyName = "defenceLevel",
			name = "Defence Level",
			description = "Your Defence level.",
			position = 80,
			section = cbtStats
	)
	default int defenceLevel()
	{
		return 99;
	}

	@Range(
			min = MIN_LEVEL,
			max = MAX_LEVEL
	)
	@ConfigItem(
			keyName = "rangedLevel",
			name = "Ranged Level",
			description = "Your Ranged level.",
			position = 90,
			section = cbtStats
	)
	default int rangedLevel()
	{
		return 99;
	}

	@Range(
			min = MIN_LEVEL,
			max = MAX_LEVEL
	)
	@ConfigItem(
			keyName = "magicLevel",
			name = "Magic Level",
			description = "Your Magic level.",
			position = 100,
			section = cbtStats
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
