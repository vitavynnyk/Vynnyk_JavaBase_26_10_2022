package com.hillel.vynnyk.homeworks.homework9;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] team1 = new int[25];
        int[] team2 = new int[25];

        double average1 = team1[0];
        for (int i = 0; i < team1.length; i++) {
            team1[i] = 18 + (int) (Math.random() * ((40 - 18) + 1));
            average1 += team1[i];
        }
        average1 /= team1.length;
        System.out.println("Team1 age: " + Arrays.toString(team1));
        System.out.println("Average age of team1: " + average1);

        double average2 = 0;
        for (int i = 0; i < team2.length; i++) {
            team2[i] = 18 + (int) (Math.random() * ((40 - 18) + 1));
            average2 += team2[i];
        }
        average2 /= team2.length;

        System.out.println();
        System.out.println("Team2 age: " + Arrays.toString(team2));
        System.out.println("Average age of team2: " + average2);
    }
}
