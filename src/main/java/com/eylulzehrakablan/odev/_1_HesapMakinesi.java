package com.eylulzehrakablan.odev;
import java.util.Scanner;

public class _1_HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // double sonuc = 0.0; şeklinde yaptığımda girdiğim ilk sayıyı işleme alamadım
        // ilk sayı girişi ve başlangıç değeri olarak sonuc'u kullanacağım

        System.out.print("Sayı giriniz: ");
        double sonuc = scanner.nextDouble();

        boolean tamamMiDevamMi = true; // sınırsız sayıda sayı ve işlem girişi olacağından dolayı hesap makinesini kapatmak için boolean kullandım

        do {

            // işlem girişi
            System.out.print("Çıkış yapmak için: 'x'\nİşlem giriniz (+, -, *, /): ");
            String islem = scanner.next();

            // sayı girişi
            System.out.print("Sayı giriniz: ");
            double sayi = scanner.nextDouble();

            if (islem.equals("x")) {
                tamamMiDevamMi = false;
                continue;
            }

            // işlem kısmı
            switch (islem) {
                case "+":
                    sonuc += sayi;
                    break;
                case "-":
                    sonuc -= sayi;
                    break;
                case "*":
                    sonuc *= sayi;
                    break;
                case "/":
                    try {
                        if (sonuc != 0) {
                            sonuc /= sayi;
                        }
                    } catch (Exception e) {
                        throw new ArithmeticException("Sifira bolme hatasi !!!!!");
                    }
                    break;
                default:
                    System.out.println("ERROR: Invalid input!");
                    continue;
            }

            System.out.printf("Sonuc: %.2f\n", sonuc);

        }
        while (tamamMiDevamMi);

        System.out.print("-------------------");
        System.out.printf("\nSonuc: %.2f\n", sonuc);
        System.out.print("-------------------");

        scanner.close();
    }
}