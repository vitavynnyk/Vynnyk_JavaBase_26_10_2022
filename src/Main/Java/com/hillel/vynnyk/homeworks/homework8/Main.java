package com.hillel.vynnyk.homeworks.homework8;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int random = (int) (Math.random() * 11);
//        System.out.println(random);

        System.out.println("Please enter your number:");
        int i = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                if (number == random) {
                    System.out.println("Congratulations! You win!");
                    break;
                }
                i++;
                if (i == 3) {
                    System.out.println("Sorry, you lost(");
                    break;
                } else {
                    System.out.println("Try again!");
                }
            } else {
                System.out.println("Wrong data! Try again!");
            }
            scanner.nextLine();
        }

    }
}






