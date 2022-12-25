package com.hillel.vynnyk.homeworks.homework12;

public class Main {
    public static void main(String[] args) {
        Person one = new Person();
        one.personInfo("Will ", "Smith ", "New York", "2936729462846");

        Person two = new Person();
        two.personInfo("Jackie ","Chan ","Shanghai","12312412412");

        Person three = new Person();
        three.personInfo("Sherlock ", "Holmes ","London", "37742123513");

    }
}

class Person {
    public String personInfo (String firstName, String secondName, String city, String phoneNumber) {
        String info = "To call to citizen " + firstName + secondName + "from city " + city + ", "
                + "phone number " + phoneNumber;
        System.out.println(info);
        return info;
    }

}