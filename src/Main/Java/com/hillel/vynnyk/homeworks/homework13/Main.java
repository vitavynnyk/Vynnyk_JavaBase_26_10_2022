package com.hillel.vynnyk.homeworks.homework13;



public class Main {
    public static void main(String[] args) {
        Burger commonBurger = new Burger("bun, ", "pork, ", "cheddar, ", "lettuce, ",
                "mayonnaise 15%.");

        Burger dietBurger = new Burger("bun, ", "chicken, ", "cheddar, ", "lettuce.");

        Burger doubleMeat = new Burger("bun, ", "pork, ", "chicken , ", "cheddar, ",
                "lettuce, ", "mayonnaise 15%.");

    }
}
class Burger {
    public String row;
    public String meat;
    public String secondMeat;
    public String cheese;
    public String green;
    public String mayonnaise;

    public Burger(String row, String meat, String cheese, String green, String mayonnaise) {
        this.row = row;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
        System.out.println(this);
    }

    public Burger(String row, String meat, String cheese, String green) {
        this.row = row;
        this.meat = meat;
        this.cheese = cheese;
        this.green = green;
        System.out.println(this);

    }
    public Burger(String row, String meat, String secondMeat, String cheese, String green, String mayonnaise) {
        this.row = row;
        this.meat = meat;
        this.secondMeat = secondMeat;
        this.cheese = cheese;
        this.green = green;
        this.mayonnaise = mayonnaise;
        System.out.println(this);


    }
    @Override
    public String toString() {
        if (mayonnaise == null) {
            return "Diet burger with " +
                    row +
                    meat +
                    cheese +
                    green;
        } else if (secondMeat == null) {
            return "Common burger with " +
                    row +
                    meat +
                    cheese +
                    green +
                    mayonnaise;
        } else {
            return "Double burger with " +
                    row +
                    meat +
                    secondMeat +
                    cheese +
                    green +
                    mayonnaise;
        }
    }
}




