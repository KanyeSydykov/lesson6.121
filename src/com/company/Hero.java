package com.company;

public class Hero {
    private int heroesHealth;
    private int heroesDamage;
    private String heroesAbilities;

    public Hero(int health, int damage, String abilities) {
        this.heroesHealth = health;
        this.heroesDamage = damage;
        this.heroesAbilities = abilities;
    }

    public Hero(int health, int damage) {
        this.heroesHealth = health;
        this.heroesDamage = damage;
    }

    public int getHealth() {
        return heroesHealth;
    }

    public int getDamage() {
        return heroesDamage;
    }

    public String getAbilities() {
        return heroesAbilities;
    }
}
