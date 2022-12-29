package com.hillel.vynnyk.homeworks.homework14;

public class User {

    public final String firstName;
    public String secondName;
    public final int year;
    public final int month;
    public final int day;
    public final String email;
    public final String phoneNumber;
    public int weight;
    public String pressure;
    public int steps;

    public User(String firstName, String secondName, int year, int month, int day, String email,
                String phoneNumber, int weight, String pressure, int steps) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.year = year;
        this.month = month;
        this.day = day;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }

    private int age;
    public int getAge() {
        age = 2020 - year;
        return age;
    }

    public String printAccountInfo() {
        String info = firstName + secondName + day + ".0" +
                month + "." + year + ", " + getAge() + " years" + ", email: " + email + "phone number: " + phoneNumber +
                " weight: " + weight + ", pressure: " + pressure + ", number of steps: " + steps + ".";
        System.out.println(info);
        return info;
    }

}
