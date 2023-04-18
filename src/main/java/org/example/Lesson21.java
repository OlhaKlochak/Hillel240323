package org.example;

public class Lesson21 {
    public static void main(String[] args) {
        int[] massive = new int[]{5, 18, 36, 74, 45, 13, 29, 15, 33, 42, 85, 78, 13, 28, 39, 11, 17, 6, 0, 55};
        int sum=0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] > 5 && massive[i] < 45) {
                sum=sum+massive[i];
            }
        }
        System.out.print(sum);
    }
}

