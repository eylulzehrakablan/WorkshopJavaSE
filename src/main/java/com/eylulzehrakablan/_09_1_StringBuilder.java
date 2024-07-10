package com.eylulzehrakablan;

public class _09_1_StringBuilder {
    public static void main(String[] args) {

        String str1 = "javase";
        String str2 = "javaee";
        String str3 = "javame";

        // 1. yol
        System.out.println(str1 + str2 + str3);

        // 2. yol
        System.out.println(str1.concat(str2).concat(str3));

        // 3. yol
        StringBuffer buffer = new StringBuffer();
        buffer.append(str1).append(str2).append(str3);
        String toBuffer = buffer.toString();
        System.out.println(toBuffer);

        // 4. yol api, xml, json, database
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str1).append(str2).append(str3);
        String toBuilder = stringBuilder.toString();
        System.out.println(toBuilder);
    }
}