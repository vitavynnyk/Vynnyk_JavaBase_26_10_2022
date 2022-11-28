package com.hillel.vynnyk.homeworks.homework6another;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter team 1 name:");
        String team1Name = scanner.nextLine();
        System.out.println(team1Name);

        double average1 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Please enter count frags player " + i + " team 1");
            int playerTeam1 = scanner.nextInt();
            average1 += playerTeam1;
        }
        scanner.nextLine();
        average1 /= 5;

        System.out.println("Please enter team 2 name:");
        String team2Name = scanner.nextLine();
        System.out.println(team2Name);

        double average2 = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Please enter count frags player " + i + " team 2");
            int playerTeam2 = scanner.nextInt();
            average2 += playerTeam2;
        }
        scanner.nextLine();
        average2 /= 5;
        System.out.println();

        System.out.println("Average score of " + team1Name + " = " + average1 + " points");
        System.out.println("Average score of " + team2Name + " = " + average2 + " points");
        System.out.println();

        if (average1 > average2) {
            System.out.println(team1Name + " is winner with result " + average1 + " points");
        } else if (average1 < average2) {
            System.out.println(team2Name + " is winner with result " + average2 + " points");
        } else {
            System.out.println("It is draw");
        }
    }
}
