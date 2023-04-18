package org.example;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first number");
        int number1=scanner.nextInt();
        System.out.println("Enter second number");
        int number2= scanner.nextInt();
        System.out.println("Enter symbol");
        String symbol=scanner.next();
        System.out.println(number1+symbol+number2+"="+Calcul.CalcUlate(number1, number2, symbol));


    }
}
