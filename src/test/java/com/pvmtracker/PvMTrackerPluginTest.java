package com.pvmtracker;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class PvMTrackerPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(PvMTrackerPlugin.class);
		RuneLite.main(args);
	}
}