package com.company;
public class Boss {
    int Health;
    int Damage;

    public int getHealth() {
        return Health;
    }

    public int getDamage() {
        return Damage;
    }

    public  Boss(int Health, int Damage) {
        this.Damage = Damage;
        this.Health=Health;
    }

}
