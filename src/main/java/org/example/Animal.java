package org.example;

public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public Animal(boolean vegetarian, String eats, int noOfLegs){
        this.eats=eats;
        if (noOfLegs<0){
            this.noOfLegs=4;
        }
        else {
            this.noOfLegs=noOfLegs;
        }
         this.vegetarian=vegetarian;

    }

    public Animal() {
        this.eats="no data";
        this.noOfLegs=0;
        this.vegetarian=false;
    }
}
