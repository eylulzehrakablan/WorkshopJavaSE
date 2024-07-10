package com.eylulzehrakablan;

public class _11_Loop {
    public static void main(String[] args) {

        System.out.println(1+2+3+4+5+6+7+8+9+10);

        // for
        int forSum = 0; //initial
        for (int i= 1; i <= 10; i++) {
            forSum = forSum + i;
        }
        System.out.println("for toplam: " +forSum);
        // sonsuz döngü for(;;) {}

        // while
        int whileSum = 0; //initial
        int w = 1;
        while (w <= 10) {
            whileSum += w;
            w++;
        }
        System.out.println("while toplam: " +whileSum);
        // sonsuz döngü while(true) {}

        // do-while
        int doWhileSum = 0; //initial
        int d = 1;
        do {
            doWhileSum += d;
            d++;
        } while (d <= 10);
        System.out.println("do-while toplam: " +doWhileSum);
        // sonsuz döngü while(true) {}
    }
}