package HomeTask;

public class BigDog extends Dog{
    void greets(){
        System.out.println("Woof");
    }
     void greets(Dog dog){
       System.out.println("Wooof");
    }
    void greets(BigDog another){
       System.out.println("Wooooooof");
    }
    public BigDog(String name) {
        super(name);
    }
}
