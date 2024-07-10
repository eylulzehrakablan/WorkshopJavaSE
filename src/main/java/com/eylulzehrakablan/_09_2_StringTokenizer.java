package com.eylulzehrakablan;
import java.util.StringTokenizer;

public class _09_2_StringTokenizer {

    public static void main(String[] args) {
        String value = "Java Javase javame Servlet*JSP~JSF_SpringMVC+SpringData-";

        // Parçalasın
        StringTokenizer tokenizer = new StringTokenizer(value, "*~_+- ");
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}