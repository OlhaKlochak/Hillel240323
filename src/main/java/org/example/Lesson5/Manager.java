package org.example.Lesson5;

public class Manager extends Employee {
    private final String lastName;
      Employee[] team;
       public Manager(String name,String lastName) {
        super(name);
        this.lastName = lastName;
    }


    @Override
    String getPosition() {
        return "Manager";
    }

    @Override
    String getSeniority() {
        return "Senior";
    }

    public String getLastName() {
        return lastName;
    }

    public void setTeamMembers(Employee... members){
           team=new Employee[members.length];
        for (int i=0;i<members.length;i++){
            team [i]=members [i];
        }

    };

    @Override
    public String getInfo() {
        String members="[";
        for (int i=0;i< team.length;i++) {
            members+=team[i].getName();
            if(i!= team.length-1){
                members+=", ";
            }
        }

        members+="]";
        return super.getInfo()+" "+" is a "+getSeniority()+" "+getPosition()+" and has a team of "+team.length+ " members;";
    }

}
