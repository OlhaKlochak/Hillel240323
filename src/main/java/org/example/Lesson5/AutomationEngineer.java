package org.example.Lesson5;

import org.example.Lesson5.Employee;

public class AutomationEngineer extends Employee {
    final String lastname;

    public AutomationEngineer(String name, String lastname) {
        super(name);
        this.lastname = lastname;
    }

    @Override
    public String getLastname() {
        return lastname;
    }

    @Override
    String getPosition() {
        return "Automation Engineer";
    }

    @Override
    String getSeniority() {
        return "Senior";
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" "+lastname+" is a "+getSeniority()+" "+getPosition();
    }
}
