package com.hillel.vynnyk.homeworks.homework15;

public class Main {
    public static void main(String[] args) {
        Android Android1 = new Android();
        IPhones Ios1 = new IPhones();

        Ios1.getOperationSystem();
        Ios1.internet();
        Ios1.call();
        Ios1.sms();
        System.out.println();

        Android1.getOperationSystem();
        Android1.internet();
        Android1.call();
        Android1.sms();

    }
}
