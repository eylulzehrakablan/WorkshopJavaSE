package com.eylulzehrakablan;
import java.util.Scanner;

public class _10_2_Conditional {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        // 1. yol
        if (age == 1) {
            System.out.println("Your age is 1");
        } else if (age == 2) {
            System.out.println("Your age is 2");
        } else if (age == 3) {
            System.out.println("Your age is 3");
        } else if (age == 4) {
            System.out.println("Your age is 4");
        } else if (age == 5) {
            System.out.println("Your age is 5");
        } else {
            System.out.println("Your age is older than 5");
        }

        // 2. yol
        switch (age) {
            case 1:
                System.out.println("Your age is 1");
                break;
            case 2:
                System.out.println("Your age is 2");
                break;
            case 3:
                System.out.println("Your age is 3");
                break;
            case 4:
                System.out.println("Your age is 4");
                break;
            case 5:
                System.out.println("Your age is 5");
                break;
            case 6:
                System.out.println("Your age is 6");
                break;
            default:
                System.out.println("Your age is older than 6");
                //we don't need a break for default
        }

    }
}