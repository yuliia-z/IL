package com.company;

public class Gun extends Weapon {
    private int bulletCount;

    public Gun(int bulletCount) {
        this.bulletCount = bulletCount;
    }

   @Override
   public void shoot() {
        if (bulletCount>0) {
            bulletCount--;
        } else {
            System.out.print("Empty cage");
        }
    }

}
