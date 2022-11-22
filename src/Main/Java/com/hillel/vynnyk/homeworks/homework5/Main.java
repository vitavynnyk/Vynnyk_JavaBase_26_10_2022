package com.hillel.vynnyk.homeworks.homework5;

public class Main {
    public static void main(String[] args) {
        int totalWarriors1 = 860;
        int totalWarriors2 = totalWarriors1 * 150/100;

        int indWarriors1 = 13;
        int indBowman1 = 24;
        int indRider1 = 46;
        int totalAttack1 = (indWarriors1 + indBowman1 + indRider1) * totalWarriors2;
        System.out.println("Загальний показник атаки династії Лі = " + totalAttack1);

        int indWarriors2 = 9;
        int indBowman2 = 35;
        int indRider2 = 12;
        int totalAttack2 = (indWarriors2 + indBowman2 + indRider2) * totalWarriors2;

        System.out.println("Загальний показник атаки династії Мінь  = " + totalAttack2);


    }
}
