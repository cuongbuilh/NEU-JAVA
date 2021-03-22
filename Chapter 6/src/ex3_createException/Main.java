package ex3_createException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        try {
            func(n);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void func(int n) throws MyException {
        if(n<0){
            throw new MyException("ex");
        }
        System.out.println(n);
    }
}
