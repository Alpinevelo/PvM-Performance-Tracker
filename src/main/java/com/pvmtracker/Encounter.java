package com.pvmtracker;

public class Encounter {
    public Participant player;
    public Participant monster;

    public Encounter(Participant player, Participant monster)
    {
        this.player = player;
        this.monster = monster;
    }

    public void addDamageDealt(String name, int damage)
    {
        if (name == null)
        {
            return;
        }
        else if(name.equals(player.getName()))
        {
            monster.addDamageDealt(damage);
        }
        else if(name.equals(monster.getName()))
        {
            player.addDamageDealt(damage);
        }
    }

    public boolean encounterStarted()
    {
        return player.getAttackCount() > 0;
    }
}
