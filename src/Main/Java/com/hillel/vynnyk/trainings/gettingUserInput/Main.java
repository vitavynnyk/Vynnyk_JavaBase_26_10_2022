package com.hillel.vynnyk.trainings.gettingUserInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Create Scanner object
        Scanner input= new Scanner(System.in);
        //Output the promt
        System.out.println(" Enter an integer:");
        // Wait for the user to enter something
        int value = input.nextInt();
        //Tell then what they entered
        System.out.println( "You entered " + value);


    }
}
