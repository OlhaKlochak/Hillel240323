package org.example;

public class Main {
    public static void main(String[] args) {
        Cat cat=new Cat(false,"mice",4,"yellow");
        cat.PrintInfo();
        Cat cat2=new Cat(false,"mice",4,"grey");
        cat2.setVegetarian(true);
        cat2.PrintInfo();
        Cat cat3=new Cat(false,"mice",-4);
        cat3.PrintInfo();

    }
}