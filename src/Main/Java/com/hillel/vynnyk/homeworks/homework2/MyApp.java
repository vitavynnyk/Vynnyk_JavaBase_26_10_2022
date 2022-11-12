package com.hillel.vynnyk.homeworks.homework2;

public class MyApp {
    public static void main(String[] args) {
        //50.379202, 30.462267
        // або 50°22'45.1"N 30°27'44.2"E
        double latitude = 50.379202;
        double longitude = 30.462267;
        System.out.println(latitude);
        System.out.println(longitude);

        String lat1="50";
        String lat2 = "22";
        String lat3= "45.1";
        char lat4= '\u004E';
        String long1= "30";
        String long2="27";
        String long3= "44.2";
        char long4  = '\u0045';
        char degree ='\u00b0';
        char apostrophe = '\'';
        String doubleQuotes = "\"";
        System.out.println(lat1+degree+lat2+apostrophe+lat3+doubleQuotes+lat4);
        System.out.println(long1+degree+long2+apostrophe+long3+doubleQuotes+long4);
    }
}
