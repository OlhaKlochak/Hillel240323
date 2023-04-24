package HomeTask;

public class Woolf extends Animals implements WildAnimal{
    public Woolf(String name) {
        super(name);
    }

    @Override
    void greets() {
        System.out.println("Woolf "+getName()+" says: Hawoo");

    }

    @Override
    public void hunting() {
        System.out.println("Woolf "+getName()+" goes hunting");

    }
}
