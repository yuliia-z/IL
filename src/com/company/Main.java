package com.company;

public class Main {
    public static void main(String[] args) {
        Soldier soldier = new Soldier(new Laser(20));
        soldier.run(20.0);
        soldier.shoot(10);
        soldier.setWeapon(new Gun(30));
        soldier.shoot(100);
    }
}
