package HomeTask;

public class Test {
    public static void main(String[] args) {
        Cat cat= new Cat("Pushok");
        test(cat);
        Dog dog= new Dog("Pufik");
        test(dog);
        Lion lion= new Lion("King");
        test(lion);
        Woolf woolf=new Woolf("Hungry");
        test(woolf);

    }
    public static void test (Cat cat){
        cat.greets();
        cat.feed();
        cat.walk();
        cat.play();
    }
    public static void test (Dog dog){
        dog.greets();
        dog.feed();
        dog.walk();
        dog.play();
    }
    public static void test(Lion lion){
        lion.greets();
        lion.hunting();
    }
    public static void test(Woolf woolf){
        woolf.greets();
        woolf.hunting();
    }
}


