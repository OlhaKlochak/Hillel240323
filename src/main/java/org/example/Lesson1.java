package org.example;

import java.io.File;

public class Lesson1 {
    public static void main(String[] args) {
        int age;
        age = 20;
        String name = "Olha Klochak";
        String name1 = "Olha Klochak";
        String name2 = new String("Olha Klochak");
        String name3 = "Olha" + " " + "Klochak";
        System.out.println(name.equals(name3));
        System.out.println(name + " " + age);
        boolean cat = true;
        byte b = 123;
        long l = 123323;
        double d = 123.23;
        b = (byte) d;
        int i;
        i = (int) l;
        System.out.println(b);
        String string = "Klochak" + " " + age;
        System.out.println(string);

    }
}
