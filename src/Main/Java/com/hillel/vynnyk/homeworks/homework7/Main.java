package com.hillel.vynnyk.homeworks.homework7;

public class Main {
    public static void main(String[] args) {
        int counter = 0 ;
        for (int i = 1; i <=100 ; i++) {
            if (!(String.valueOf(i).contains("4") || String.valueOf(i).contains("9"))){
                System.out.println("Number of spaceship: " + i);
                counter++;
            }
        }

        System.out.println("Total number of spaceships: " + counter);
    }
}
