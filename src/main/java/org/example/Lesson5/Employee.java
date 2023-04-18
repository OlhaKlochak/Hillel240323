package org.example.Lesson5;

public abstract class Employee {
    final String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public String getLastname(){
        return "";
    }
    abstract String getPosition();
    abstract String getSeniority();
    public String getInfo(){
        return name;
    };
}
