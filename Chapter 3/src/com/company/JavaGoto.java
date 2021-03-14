package com.company;

public class JavaGoto {
    public static void main(String[] args) {
        int max = 4;
        int limit = 3;
        out:
        for (int row = 1; row <= max; row++) {
            for (int col = 1; col <= max; col++) {
                System.out.printf("col=%d, row=%d\n", row, col);
                if (row == limit) {
                    break out;
                }
            }
        }
    }
}
