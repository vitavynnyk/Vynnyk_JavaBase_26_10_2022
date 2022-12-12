package com.hillel.vynnyk.homeworks.homework10;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbersOfFirm = new int[7];
        int[] numbersOfPlayer = new int[7];
        int counter = 0;

        for (int i = 0; i < numbersOfFirm.length; i++) {
            numbersOfFirm[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(numbersOfFirm);

        for (int i = 0; i < numbersOfPlayer.length; i++) {
            numbersOfPlayer[i] = (int) (Math.random() * 10);
        }
        Arrays.sort(numbersOfPlayer);

        for (int i = 0; i <numbersOfPlayer.length ; i++) {
            if (numbersOfPlayer[i]==numbersOfFirm[i]){
                counter++;
            }
        }

        System.out.println("Numbers of Firm: " + "\n" + Arrays.toString(numbersOfFirm));
        System.out.println();
        System.out.println("Numbers of Player: " + "\n" + Arrays.toString(numbersOfPlayer));
        System.out.println();
        System.out.println("Number of coincidences: " + counter);
    }
}
