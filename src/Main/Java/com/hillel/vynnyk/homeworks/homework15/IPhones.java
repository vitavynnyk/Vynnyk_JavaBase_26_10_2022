package com.hillel.vynnyk.homeworks.homework15;

public class IPhones implements Smartphones, Ios {

    @Override
    public void call() {
        System.out.println("IPhone Call");
    }

    @Override
    public void sms() {
        System.out.println("IPhone SMS");
    }

    @Override
    public void internet() {System.out.println("IPhone internet");
    }
    @Override
    public void getOperationSystem() {System.out.println("iOS");
    }
}
