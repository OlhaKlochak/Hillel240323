package HomeTask9;

public class Variants {

    public static void getVariants(Size size){
        switch (size){
            case SMALL:
            {System.out.println("SMALL");
                System.out.println(size.getSizeChart());
                System.out.println(size.getWidth());
                System.out.println(size.getLength());}
            break;
            case MEDIUM:
            {System.out.println("MEDIUM");
                System.out.println(size.getSizeChart());
                System.out.println(size.getWidth());
                System.out.println(size.getLength());}
            break;
            case LARGE:
            {System.out.println("LARGE");
                System.out.println(size.getSizeChart() + size.getWidth() + size.getLength());}
                break;
            case EXTRA_LARGE:
            {System.out.println("EXTRA_LARGE");
                System.out.println(size.getSizeChart() + size.getWidth() + size.getLength());}
                break;
        }
    }
}
