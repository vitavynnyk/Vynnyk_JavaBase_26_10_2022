package com.hillel.vynnyk.homeworks.homework15;

public class Android implements Smartphones,LinuxOS {
    @Override
    public void call() {System.out.println("Android Call");
    }

    @Override
    public void sms() {System.out.println("Android SMS");
    }

    @Override
    public void internet() {System.out.println("Android Internet");
    }

    @Override
    public void getOperationSystem() {System.out.println("LinuxOS");
    }
}
