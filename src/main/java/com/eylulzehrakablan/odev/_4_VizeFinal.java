package com.eylulzehrakablan.odev;
import java.util.Scanner;

/*
1 - girilen vize ve final notu + vize ve final oranına göre ortalama hesaplama
    - input vize notu, vize oran
    - input final notu, final oran
    - if vize oran + final oran > 100 || (vize notu || final notu) > 100 error
2 - girilen geçme puanına, vize notuna ve oranına göre final sınavından alınması gereken en düşük puanı hesaplama
    - input geçme puanı
    - input vize notu, input vize oran
    - if (geçme puanı || vize notu) > 100 || vize oran > 100 error
*/

public class _4_VizeFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vizeNotu, vizeOran;

        System.out.print("1-) Vize ve final notları ile ortalama hesaplama\n" + "2-) Dersi geçmek için gerekli en düşük final puanını hesaplama\n" + "Seçiminiz: ");
        int secim = scanner.nextInt();

        switch (secim) {
            case 1:
                System.out.println("\n--- Vize ve final notları ile ortalama hesaplama ---");

                // input notlar ve oranlar
                System.out.println("Vize notunu giriniz: ");
                vizeNotu = scanner.nextDouble();

                System.out.println("Vize sınavı oranı: ");
                vizeOran = scanner.nextDouble();

                System.out.println("Final notunu giriniz: ");
                double finalNotu = scanner.nextDouble();

                System.out.println("Final sınavı oranı: ");
                double finalOran = scanner.nextDouble();

                try {
                    if (vizeNotu > 100 || finalNotu > 100 || (vizeOran + finalOran > 100)) {
                        throw new IllegalArgumentException("Geçersiz not veya oran girişi! \n-Notlar 0-100 arasında olmalıdır, \n-oranlar toplamı 100'i geçemez.");
                    }
                } catch (IllegalArgumentException e) {
                    System.err.println("HATA: " + e.getMessage());
                    System.exit(0);
                }

                // Ortalama = ((vize notu * vize oranı) + (final notu * final oranı)) / (vize oranı + final oranı)

                double ortalama = ((vizeNotu * vizeOran / 100) + (finalNotu * finalOran / 100)) / ((vizeOran / 100) + (finalOran / 100));

                System.out.printf("Ortalamanız: \n--- %.2f ---", ortalama);

                break;

            case 2:
                System.out.println("\n--- Dersi geçmek için gerekli en düşük final puanını hesaplama ---");

                System.out.println("Dersin geçme notunu giriniz: ");
                double gecmeNotu = scanner.nextDouble();

                System.out.println("Vize notunuzu giriniz: ");
                vizeNotu = scanner.nextDouble();

                System.out.println("Vize oranını giriniz: ");
                vizeOran = scanner.nextDouble();

                try {
                    if (gecmeNotu > 100 || vizeNotu > 100 || vizeOran > 100 ) {
                        throw new IllegalArgumentException("Geçersiz not veya oran girişi! \n-Notlar 0-100 arasında olmalıdır, \n-oranlar toplamı 100'i geçemez.");
                    }
                } catch (IllegalArgumentException e) {
                    System.err.println("HATA: " + e.getMessage());
                    System.exit(0);
                }

                // Geçme notu = (vize notu * vize oranı) + min final notu * (1 - vize oranı)
                // Min final notu = (Geçme notu - vize notu * vize oranı) / (1 - vize oranı)

                double minFinalNotu = (gecmeNotu - (vizeNotu * vizeOran / 100)) / (1 - (vizeOran / 100));

                System.out.printf("Dersi geçmek için almanız gereken en düşük final notu: \n--- %.2f ---", minFinalNotu);

                break;

            default: System.out.println("ERROR: Invalid choice!");
        }
        scanner.close();
    }
}
