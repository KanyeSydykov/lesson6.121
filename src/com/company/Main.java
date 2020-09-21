package com.company;

import com.company.Boss;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setBossDamge(50);
        boss.setBossHealth(100);
        boss.setBossDefence("Magic");

        System.out.println("Характеристики босса:" + " " + boss.getBossDamge() + " " +
                boss.getBossHealth() + " " + boss.getBossDefence());
    }
}
