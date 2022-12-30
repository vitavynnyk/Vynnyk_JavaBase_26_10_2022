package com.hillel.vynnyk.homeworks.homework14;

public class User {

    private final String firstName;
    private String secondName;
    private final int year;
    private final int month;
    private final int day;
    private final int age;
    private final String email;
    private final String phoneNumber;
    private int weight;
    private String pressure;
    private int steps;


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
        age = 2020-year;
    }

    public int getAge() {
        return age;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setPressure(String pressure) {
        this.pressure = pressure;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public int getWeight() {
        return weight;
    }
    public String getPressure() {
        return pressure;
    }
    public int getSteps() {
        return steps;
    }

    public void printAccountInfo() {
        System.out.println (firstName + secondName + day + "." +
                month + "." + year + ", " + age + " years" + ", email: " + email +"\n" +"phone number: " + phoneNumber +
                " weight: " + weight + ", pressure: " + pressure + ", number of steps: " + steps + ".");
    }

}
