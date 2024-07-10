package com.eylulzehrakablan.odev;
import java.time.LocalDate;

// Haftanın günlerinden şimdiki zamanı bulan ve gösteren uygulama

public class _2_HaftaninGunu {
    public static void main(String[] args) {

        LocalDate simdikiZaman = LocalDate.now();
        int gun = simdikiZaman.getDayOfWeek().getValue(); // 1-7 arasında bir değer döndürecek

        System.out.println();

        switch (gun) {
            case 1:
                System.out.println("pazartesi"); break;
            case 2:
                System.out.println("salı"); break;
            case 3:
                System.out.println("çarşamba"); break;
            case 4:
                System.out.println("perşembe"); break;
            case 5:
                System.out.println("cuma"); break;
            case 6:
                System.out.println("cumartesi"); break;
            case 7:
                System.out.println("pazar"); break;
            default:
                System.out.println("Geçersiz gün numarası!"); // Hata durumu
                System.exit(0);
        }
    }
}
