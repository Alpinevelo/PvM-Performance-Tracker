package com.pvmtracker;

public class Participant {
    private int damageDealt;
    private String name;
    private int attackCount;

    public Participant()
    {
         damageDealt = 0;
         name = "";
         attackCount = 0;
    }
    void addDamageDealt(int damage)
    {
        damageDealt += damage;
    }

    public int getDamageDealt()
    {
        return damageDealt;
    }
    public String getName()
    {
        return name;
    }

    public int getAttackCount()
    {
        return attackCount;
    }

}
