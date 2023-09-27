package com.kodilla.testing;

import com.kodilla.testing.user.SimpleUser;
import com.kodilla.testing.calculator.Calculator;

class TestingMain {

    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        //new test for Calculator

        Calculator calculator = new Calculator();


        int additionResult = calculator.add(5, 3);
        if (additionResult == 8) {
            System.out.println("Add function works");
        } else {
            System.out.println("Add function doesnt work");
        }

        int subtractionResult = calculator.subtract(10, 4);
        if (subtractionResult == 6) {
            System.out.println("Subtract function works");
        } else {
            System.out.println("Subtract function doesnt work.");
        }
    }
}