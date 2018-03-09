package com.company.ui;

import java.util.Scanner;

public class UserInteractionHelper {

    public static void printResults(int result) {
        System.out.println("Result: " + result);
    }

    public static int getNumberFromUser(String variable) {
        int result;

        System.out.println("Please enter number " + variable + " value: ");

        Scanner scanner = new Scanner(System.in);
        result = scanner.nextInt();
        return result;
    }

}
