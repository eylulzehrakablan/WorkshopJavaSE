package com.eylulzehrakablan;
import java.util.Scanner;

public class _07_Scanner {
    public static void main(String[] args) {

        // Kullanıcıdan veri almak istersek
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen adınızı giriniz: ");
        String name = scanner.nextLine();

        System.out.println("Adınız: " + name);

        scanner.close();
    }
}
