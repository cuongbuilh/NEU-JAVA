package com.company;

public class PrintNumberPattern {
    public static void main(String[] args) {
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4 5 6
//        1 2 3 4 5 6 7
//        1 2 3 4 5 6 7 8
        int line =8;
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < line; j++) {
                if( j <= i){
                    System.out.print(j+1 + " ");
                }
            }
            System.out.println();
        }
    }
}
