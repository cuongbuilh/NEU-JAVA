package com.company;

public class PascalTriagle {
    public static void main(String[] args) {
        int line =7;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                if(j > i){
                    continue;
                }

                if(j == 0){
                    System.out.print(1);
                }
                if(i == j && j!=0){
                    System.out.print(1);
                }
                if(j!=0 && i!=j){
                    System.out.print(i);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
