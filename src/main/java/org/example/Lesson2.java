package org.example;

import java.util.Arrays;
import java.util.Random;

public class Lesson2 {
    public static void main(String[] args) {
        int length = 20;
        int[] mass = new int[length];
        Random random = new Random();
        {
            for (int i = 0; i < mass.length; i++) {
                mass[i] = random.nextInt((50  +50) + 1) -50;

                    if (mass[i] % 2 == 0&& mass[i]>0) {
                        System.out.print(" " + mass[i]);
                    }
            }
        }
    }
}




//       for (int i=massive.length-1;i>=0;i--){
//           System.out.println(i+1+ " "+massive[i]+" ");
//       }
//
//        int[][]matrix=new int[][]{
//                {5,9,8},
//                {2,6,7},
//                {3,4,1}
//        };
//        System.out.println(matrix[0][1]);
//        System.out.println(matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1]);
//
//        double[] numbers2 = new double[] {1.0, 1.5, 3.6};
//
//        int h=16;
//        if(h<12){
//            System.out.println("good morning");
//        }
//        else {
//            System.out.println("good afternoon");
//            String str="Oll";
//            switch (str){
//                case "Olha":
//                    System.out.println("Hello");
//                    break;
//                case "Pasha":
//                    System.out.println("Baby");
//                    break;
//                default:
//                    System.out.println("no such word");
//                    break;
//            }
//        }
//    }
//}
