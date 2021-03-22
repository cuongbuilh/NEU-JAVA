package Aptech;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Account{
    private String accountName;
    private int accountNumber;
    private double accountBalance;

    public Account(){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nEnter your infomation:");
            System.out.println("name:");
            accountName = sc.nextLine();
            System.out.println("accNumber:");
            accountNumber = sc.nextInt();
            accountBalance = 0;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    };

    public Account(String accountName, int accountNumber, double accountBalance) throws NegativeAmountException {
        if (accountBalance < 0){
            throw new NegativeAmountException("negative Amount Exception");
        }else{
            this.accountName = accountName;
            this.accountNumber = accountNumber;
            this.accountBalance = accountBalance;
        }
    }

    public void displayAccountDetails(){
        System.out.println("name: " + accountName);
        System.out.println("accNum" + accountNumber);
        System.out.println("accBalance" + accountBalance);
    }

    public void withdraw() throws InsufficientFundException {
        // ruts tien mat
        System.out.println("nhap so tien rut:");
        Scanner sc = new Scanner(System.in);
        double st = sc.nextDouble();

        if(st<accountBalance){
            throw new InsufficientFundException("khong du tien");
        }

    }

    public void deposit() throws NegativeAmountException {
        // gui tien
        System.out.println("nhap so tien gui");
        Scanner sc = new Scanner(System.in);
        try {
            double st = sc.nextDouble();
            if(st <0){
                throw new NegativeAmountException("so tien am");
            };
        } catch(InputMismatchException e){
            throw e;
        }
    }

}
