package org.example.Lesson5;

public class ManualTestEngineer extends Employee {
    final String lastname;

    public ManualTestEngineer(String name, String lastname) {
        super(name);
        this.lastname = lastname;
    }

    @Override
    String getPosition() {
        return "Manual Test Engineer";
    }

    @Override
    String getSeniority() {
        return "Junior";
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" "+lastname+" is a "+getSeniority()+" "+getPosition();
    }
}
