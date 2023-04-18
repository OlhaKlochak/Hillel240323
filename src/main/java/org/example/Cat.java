package org.example;

public class Cat extends Animal{
    private String color;

    public String getColor() {
        return color;
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color=color;
    }

    public Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        color="no data";

    }

    public void setColor(String color) {
        this.color = color;

    }
    public void PrintInfo(){
        System.out.println("Cat info "+isVegetarian()+" "+getEats()+" "+getNoOfLegs()+" "+getColor());
    }
}
