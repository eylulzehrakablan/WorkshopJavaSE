package com.eylulzehrakablan;

import java.util.Scanner;

public class _15_Method {

    // 1-) returnsuz parametresiz
    public void returnsuzParametresiz() {
        System.out.println("returnsuzParametresiz");
    }

    // 2-) returnsuz parametreli
    // overloading
    public void returnsuzParametreli(String name) {
        System.out.println("returnsuzParametreli: " + name);
    }

    // 2-) returnsuz parametreli
    public void returnsuzParametreli(String name, int data) {
        System.out.println("returnsuzParametreli: " + name + " " + data);
    }

    // 3-) returnlu parametresiz
    public String returnluParametresiz() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı giriniz: ");
        String name = scanner.nextLine();

        return "returnluParametresiz: " + name + "\n";
    }

    // 4-) returnlu parametreli
    public String returnluParametreli(String surname) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı giriniz: ");
        String name = scanner.nextLine();

        return "returnluParametreli: " + name + " " + surname + "\n";
    }

    public static void main(String[] args) {

        _15_Method method = new _15_Method();

        method.returnsuzParametresiz();
        method.returnsuzParametreli("Zehra");
        method.returnsuzParametreli("Zehra", 20);

        String result = method.returnluParametresiz();
        System.out.println(result);
        //System.out.println(method.returnluParametresiz());

        String result2 = method.returnluParametreli("Kaplan");
        System.out.println(result2);
        //System.out.println(method.returnluParametreli("Kaplan"));
    }
}
