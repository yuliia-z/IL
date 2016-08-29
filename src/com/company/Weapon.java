package com.company;

abstract public class Weapon {

    public void shoot() {};

    public void shoot(int amount) {
        for (int i = 0; i < amount ; i++) {
            shoot();
        }
    }
}
