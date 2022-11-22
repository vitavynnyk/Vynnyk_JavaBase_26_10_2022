package com.hillel.vynnyk.homeworks.homework4;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c =7;
        int volume = a * b * c;
        char superScript ='\u00B3';
        System.out.println("Об'єм паралелепіпеда = " + volume + " см" + superScript);
        int length = (a+b+c)*4;
        System.out.println("Сумарна довжина сторін = " + length+ " см");

    }
}
