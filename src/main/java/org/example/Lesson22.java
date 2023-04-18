package org.example;

public class Lesson22 {
    public static void main(String[] args) {
        int[][]matrix=new int[][]{
                {5,8,9},
                {17,20,8},
                {55,69,45,7,15,22}

        };
        for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
        }
    }
}
