package com.hillel.vynnyk.homeworks.homework11;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter number of rows:");

        while (true) {
            if (scanner.hasNextInt()) {
                int row = scanner.nextInt();
                if (row > 0) {
                    System.out.println("Please enter number of columns:");
                    scanner.nextLine();
                    while (true) {
                        if (scanner.hasNextInt()) {
                            int col = scanner.nextInt();
                            if (col > 0) {
                                int[][] number = new int[row][col];
                                int [][] numberNew= new int[col][row];
                                for (int i = 0; i < number.length; i++) {
                                    for (int j = 0; j < number[i].length; j++) {
                                        number[i][j] = (int) (Math.random() * 11);
                                        System.out.print(number[i][j] + "\t");
                                    }
                                    System.out.println();
                                }
                                System.out.println();
                                for (int i = 0; i < row; i++) {
                                    for (int j = 0; j < col; j++) {
                                        numberNew[j][i] = number[i][j];
                                    }
                                }
                                for (int i = 0; i < col; i++) {
                                    for (int j = 0; j < row; j++) {
                                        System.out.print(numberNew[i][j] + "\t");
                                    }
                                    System.out.println();
                                }
                                break;
                            } else {
                                System.out.println("Please enter positive number ");
                            }

                            } else {
                            System.out.println("Wrong data!" + "\n" + "Please enter number of columns!");

                        }scanner.nextLine();
                    }
                    break;
                } else {
                    System.out.println("Please enter positive number ");
                }

            } else {
                System.out.println("Wrong data!" + "\n" + "Please enter number of rows!");
            }
            scanner.nextLine();
        }
    }
}







