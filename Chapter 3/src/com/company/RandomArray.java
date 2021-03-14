package com.company;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        int h=6;

        int[][][] arr = new int[a][b][h];

        Random rnd = new Random();
        for(int x=0; x<a; x++){
            for(int y=0; y<b; y++){
                for(int z=0; z<h; z++){
                    arr[x][y][z] = rnd.nextInt(10);
                }
            }
        }

        for(int x=0; x<a; x++){
            for(int y=0; y<b; y++){
                for(int z=0; z<h; z++){
                    System.out.print(arr[x][y][z] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
