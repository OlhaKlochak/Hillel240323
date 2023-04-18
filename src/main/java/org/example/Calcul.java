package org.example;

public class Calcul {
    public static int CalcUlate(int number, int number2, String symbol) {
        int result=0;

        switch (symbol) {
            case "+":
                result=sum(number, number2);
                break;
            case "-":
                result=minus(number,number2);
                break;
            case "*":
                result=multiply(number,number2);
                break;
            case "/":
                if(number2==0){
                    result=0;
                    System.out.println("Error divide by zero exeption");
                    break;
                }
                result=divide(number,number2);
                break;
            case"%":
                result=remainder(number,number2);
                break;
            default:
                System.out.println("Error");
                System.exit(0);
        }
        return result;
    }

    private static int remainder(int number, int number2) {
        return (number*number2)/100;
    }

    private static int divide(int number, int number2) {
        return number / number2;
        }

    private static int multiply(int number, int number2) {
        return number*number2;
    }

    private static int minus(int number, int number2) {
        return number-number2;
    }


    private static int sum(int number, int number2) {
        return number+number2;
    }
}
