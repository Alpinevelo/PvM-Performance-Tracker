package com.pvmtracker;

import net.runelite.api.Player;
public class Adventurer {
    private Player player;
    private boolean isDead;
    private int attackCount;
    private String name;
    private int damageDealt;
    private float deservedDamage;

    public Adventurer()
    {
        attackCount = 0;
        name = player.getName();
        isDead = false;
        damageDealt = 0;
        deservedDamage = 0.0f;
    }

    void addDamageDealt(int damage)
    {
        damageDealt += damage;
    }

    public int getDamageDealt()
    {
        return damageDealt;
    }
}
