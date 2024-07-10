package com.eylulzehrakablan.odev;
import java.util.Scanner;

// Radar uygulaması : 90-100 Ceza: 1000 TL
// Radar uygulaması : 101-110 Ceza: 2000 TL
// Radar uygulaması : 111-130 Ceza: 3000 TL
// Radar uygulaması : 131 Ceza: 10000 TL + ehliyete el konulsun

enum ParaCezasi {

    // alt sınır - üst sınır - para cezası
    _90_(90, 100, 1000),
    _101_(101, 110, 2000),
    _111_(111, 130, 3000),
    _131_(131, Integer.MAX_VALUE , 10000); //Integer.MAX_VALUE baktım

    private final int altSinir;
    private final int ustSinir;
    private final int paraCezasi;

    // constructors
    ParaCezasi(int altSinir, int ustSinir, int paraCezasi) {
        this.altSinir = altSinir;
        this.ustSinir = ustSinir;
        this.paraCezasi = paraCezasi;
    }

    // getters
    public int getAltSinir() {
        return altSinir;
    }
    public int getUstSinir() {
        return ustSinir;
    }
    public int getParaCezasi() {
        return paraCezasi;
    }
}

public class _3_RadarUygulamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Araç hızı: ");
        boolean ehliyet = true;
        int hiz = scanner.nextInt();

        ParaCezasi ceza = null;

        try {
            // Geçersiz bir hız değeri girilirse
            if (hiz < 0) {
                throw new IllegalArgumentException("Hız 0'dan küçük olamaz, lütfen geçerli bir hız değeri giriniz.");
            }

            // enum'dan para cezası için hız aralığını bul
            for (ParaCezasi cezaAralik : ParaCezasi.values()) {
                if (hiz >= cezaAralik.getAltSinir() && hiz <= cezaAralik.getUstSinir()) {
                    ceza = cezaAralik;
                    break;
                }
            }

            // Hız 131 veya daha fazla ise ehliyete el koy
            if (ceza == ParaCezasi._131_) {
                ehliyet = false;
            }

            System.out.println("--------------------------------");
            System.out.println("RADAR UYGULAMASI:\nCeza: " + ceza.getParaCezasi() + "₺");
            if (!ehliyet) {
                System.out.println("Ehliyetinize el konulmuştur.");
            }
            System.out.println("--------------------------------");

        } catch (Exception e) {
            System.out.println("Hatalı Giriş: " + e.getMessage());
        }
        scanner.close();
    }
}