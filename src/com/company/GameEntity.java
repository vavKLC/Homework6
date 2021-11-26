package com.company;

public class GameEntity {
    private int health;
    private int damage;
    private String  aby;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getAby() {
        return aby;
    }

    public void setAby(String aby) {
        this.aby = aby;
    }
    public String information(){
        return "Health:" + health + " " + "damage:" + damage + " " + "aby:" + aby;
    }
}
