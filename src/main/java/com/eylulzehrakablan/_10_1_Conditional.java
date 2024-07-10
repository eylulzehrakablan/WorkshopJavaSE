package com.eylulzehrakablan;

public class _10_1_Conditional {
    public static void main(String[] args) {
        int age = 18;

        // 1.yol
        if (age >= 18) {
            System.out.println("Your age is greater than or equal to 18.");
        } else {
            System.out.println("Your age is less than 18.");
        }

        // 2.yol (Ternary)
        String result = (age >= 18)? "Your age is greater than or equal to 18." : "Your age is less than 18.";
        System.out.println(result);
        System.out.println(result.toUpperCase());

        // 3. YOL (Switch Case)
        switch (age) {
            case 18:
                System.out.println("Your age is greater than or equal to 18.");
                break;
            default:
                System.out.println("Your age is less than 18.");
                break;
        }
    }
}