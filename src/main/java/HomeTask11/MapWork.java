package HomeTask11;

import HomeTask.Animals;

import java.util.*;

public class MapWork {


    public static void main(String[] args) {
        Map<Integer, String> info = new HashMap<>();
        info.put(10, "Tiger");
        info.put(8, "Dog");
        info.put(19, "Cat");
        info.put(5, "Rino");
        info.put(1, "Dinosaur");
        printInfo(info);

    }

    public static void printInfo(Map<Integer, String> AnimalMap) {
        Set<Integer> infoNum = new TreeSet<>(AnimalMap.keySet());
        for (Integer key : infoNum) {
            for (Map.Entry<Integer, String> l : AnimalMap.entrySet()) {
                if (l.getKey() == key) {
                    System.out.println(l.getValue() + l.getKey());
                }

            }
        }
    }
}






