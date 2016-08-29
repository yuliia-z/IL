package com.company;

public class Soldier {
    private  int health = 100;
    private double coordinateX = 0;
    private double coordinateY = 0;
    private Weapon weapon;

    public Soldier(Weapon weapon) {
        this.weapon = weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void shoot() {
        weapon.shoot();
    }

    public void shoot(int amount) {
        weapon.shoot(amount);
    }

    public void run(double distance) {
        getHealth();
        if (health > 0) {
            coordinateX = coordinateX + distance;
            coordinateY = coordinateY + distance;
            health--;
            System.out.print("Distance = " + coordinateX + "|" + coordinateY);
            System.out.print(" Health = " + getHealth());
        } else {
            System.out.print("Health is over");
        }
    }

    private int getHealth() {
        return health;
    }
}
