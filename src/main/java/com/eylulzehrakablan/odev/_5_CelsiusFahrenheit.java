package com.eylulzehrakablan.odev;
import java.util.Scanner;

/*
1-) celicus'tan fahrenheit'a
    fahrenheit = (celcius x 9 / 5) + 32
2-) fahrenheit'tan celcius'a
    celcius = (fahrenheit - 32) x 5 / 9

celcius = (fahrenheit - 32) / 1.8
 */

public class _5_CelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celcius, fahrenheit;

        System.out.println("1-) Celcius to Fahrenheit");
        System.out.println("2-) Fahrenheit to Celsius\nChoice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Derece cinsinden sıcaklığı giriniz: ");
                celcius = scanner.nextDouble();
                fahrenheit = (celcius * 9 / 5) + 32;
                System.out.printf("%.2f derece = %.2f Fahrenheit", celcius, fahrenheit);
                break;
            case 2:
                System.out.println("Fahrenheit cinsinden sıcaklığı giriniz: ");
                fahrenheit = scanner.nextDouble();
                celcius = (fahrenheit - 32) * 5 / 9;
                System.out.printf("%.2f Fahrenheit = %.2f Celcius.", fahrenheit, celcius);
                break;
            default:
                throw new IllegalArgumentException("HATA: Geçersiz seçim!");
        }
        scanner.close();
    }
}