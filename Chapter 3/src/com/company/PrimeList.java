package com.company;

public class PrimeList {
    public static void main(String[] args) {
        int upperbound = 100;
        for (int number = 2; number <= upperbound; number++) {
            int maxFactor = (int)Math.sqrt(number);
            boolean isPrime = true;
            int factor = 2;
            while (isPrime && factor <= maxFactor) {
                if (number % factor == 0) {
                    isPrime = false;
                }
                factor++;
            }
            if (isPrime)
                System.out.print(number + " ");
        }

    }
}
