package com.hillel.vynnyk.homeworks.homework6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Please enter team 1 name:");
        String team1Name = scanner.nextLine();
        System.out.println(team1Name);

        System.out.println("Please enter count frags player 1 team 1");
        int player1Team1 = scanner.nextInt();

        System.out.println("Please enter count frags player 2 team 1");
        int player2Team1 = scanner.nextInt();

        System.out.println("Please enter count frags player 3 team 1");
        int player3Team1 = scanner.nextInt();

        System.out.println("Please enter count frags player 4 team 1");
        int player4Team1 = scanner.nextInt();

        System.out.println("Please enter count frags player 5 team 1");
        int player5Team1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please enter team 2 name:");
        String team2Name = scanner.nextLine();
        System.out.println(team2Name);

        System.out.println("Please enter count frags player 1 team 2");
        int player1Team2 = scanner.nextInt();

        System.out.println("Please enter count frags player 2 team 2");
        int player2Team2 = scanner.nextInt();

        System.out.println("Please enter count frags player 3 team 2");
        int player3Team2 = scanner.nextInt();

        System.out.println("Please enter count frags player 4 team 2");
        int player4Team2 = scanner.nextInt();

        System.out.println("Please enter count frags player 5 team 2");
        int player5Team2 = scanner.nextInt();
        scanner.nextLine();

        double averageTeam1 = ((double)player1Team1 + player2Team1 + player3Team1 + player4Team1 + player5Team1)/5;
        System.out.println("Average score of " + team1Name + " = " + averageTeam1);

        double averageTeam2 = ((double) player1Team2 + player2Team2 + player3Team2 + player4Team2 + player5Team2)/5;
        System.out.println("Average score of "+ team2Name + " = " + averageTeam2);
        System.out.println();

        if ( averageTeam1>averageTeam2){
            System.out.println(team1Name + " is winner with result " + averageTeam1 + " points" );
        }
        else if (averageTeam1<averageTeam2){
            System.out.println(team2Name + " is winner with result " + averageTeam2 + " points");
        } else {
            System.out.println("It is draw");
        }
    }
}
