package com.company;

public class Main {
    public static void main(String[] args) {
        Soldier soldier = new Soldier(new Gun(30));
        soldier.run(20.0);
        soldier.shoot(10);
        soldier.setWeapon(new Laser(40));
        soldier.shoot(100);
    }
}
