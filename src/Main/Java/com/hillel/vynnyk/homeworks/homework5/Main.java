package com.hillel.vynnyk.homeworks.homework5;

public class Main {
    public static void main(String[] args) {
        int totalWarriors1 = 860;
        int totalWarriors2 = totalWarriors1 * 150/100;

        int indWarrior1 = 13;
        int indBowman1 = 24;
        int indRider1 = 46;
        int totalAttack1 = (indWarrior1 + indBowman1 + indRider1) * totalWarriors2;
        System.out.println("Загальний показник атаки династії Лі = " + totalAttack1);

        int indWarrior2 = 9;
        int indBowman2 = 35;
        int indRider2 = 12;
        int totalAttack2 = (indWarrior2 + indBowman2 + indRider2) * totalWarriors2;

        System.out.println("Загальний показник атаки династії Мінь  = " + totalAttack2);


    }
}
