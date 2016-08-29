package com.company;

public class Laser extends Weapon {
    private int power = 0;
    private int batteryStatus;

    public Laser(int batteryStatus) {
        this.batteryStatus = batteryStatus;
    }

    @Override
    public void shoot() {
        ionicStorageStart();
        if (power >= 20){
            fire();
        } else {
            System.out.print("Battery low");
        }
    }

    private void ionicStorageStart() {
        batteryStatus--;
        power += 20;
    }

    public void fire() {
        power -= 20;
    }
}
