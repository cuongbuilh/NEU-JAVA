package Aptech;

import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Account acc = null;
        byte choice;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("\nSelect option from the folowing:");
            System.out.println("\n0. createAcc\n1. withdraw cash\n2. deposit cash\n3. exit");

            System.out.println("enter your choice: ");
            choice = sc.nextByte();

            if(choice == 0 ){
                acc = new Account();
            }else if(choice ==1 ){
                acc.displayAccountDetails();
                try {
                    acc.withdraw();
                } catch (InsufficientFundException e) {
                    System.out.println(e.getMessage());
                } catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }else if(choice ==2 ){
                acc.displayAccountDetails();
                try {
                    acc.deposit();
                } catch (NegativeAmountException e) {
                    System.out.println(e.getMessage());
                }catch(Exception e){
                    System.out.println(e.getMessage());
                }
            }
        }while(choice != 3);
    }
}
