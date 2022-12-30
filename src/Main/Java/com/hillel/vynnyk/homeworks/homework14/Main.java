package com.hillel.vynnyk.homeworks.homework14;

public class Main {
    public static void main(String[] args) {

        User user1 = new User("Vita ", "Vynnyk, ", 1995,
                6, 11, "vitavynnyk1995@gmail.com, ",  "0509349580,",
                58, "120:60", 10000);
        user1.printAccountInfo();

        user1.setSteps(10500);
        user1.setWeight(55);

        user1.printAccountInfo();
        System.out.println();

        User user2 = new User("Olga ", "Kvitka, ", 1990,
                4, 25, "olgakvitka1990@gmail.com, ",  "0934958067,",
                55, "120:75", 12000);
        user2.printAccountInfo();
        System.out.println();

        User user3 = new User("Vasyl ", "Soroka, ", 1993,
                11, 30, "vasylsoroka1993@gmail.com, ",  "0682356178,",
                72, "130:75", 11000);
        user3.printAccountInfo();

        user3.setWeight(68);
        user3.setPressure("130:80");
        user3.printAccountInfo();
        System.out.println();

        User user4 = new User("Julia ", "Kravchuk, ", 1997,
                5, 6, "juliakravchuk1997@gmail.com, ",  "0987654328,",
                55, "100:60", 12000);

        user4.printAccountInfo();
    }
}