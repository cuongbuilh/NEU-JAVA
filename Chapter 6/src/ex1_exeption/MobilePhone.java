package ex1_exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MobilePhone {
    int phoneNumbers[];
    String message;

    MobilePhone(){
        message = "";
    };

    public void setPhoneNumbers(){
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter the number of mobile numbers to store:");
            int size  = input.nextInt();
            phoneNumbers = new int[size];

            for(int index = 0;index < phoneNumbers.length;index++) {
                System.out.println("Enter a phone number:");
                phoneNumbers[index] = input.nextInt();
            }
        } catch(NegativeArraySizeException e) {
            System.out.println("Exception occurred - " +
                    "Array size should be a positive value.");
        } catch(InputMismatchException e) {
            System.out.println("Exception occurred - Data type mismatch." +
                    " Enter non-zero numeric value and try again.");
        } catch(Exception e) {
            System.out.println("Exception occurred - " + e.getMessage());
        }

    };

    public void getPhoneNumbers() {

        System.out.println("The mobile phone database consists of following phone numbers:");
        for(int index = 0;index < phoneNumbers.length;index++) {
            System.out.println(index + ". " + phoneNumbers[index]);
        }
    }

    public void sendMessage() {
        Scanner input = new Scanner(System.in);
        try {
            getPhoneNumbers();
            System.out.println("Enter the index of phone number to which you want to send the message:");
            int index  = input.nextInt();
            System.out.println("Enter the message text: ");
            // Remove enter key in buffer
            input.nextLine();
            this.message = input.nextLine();
            System.out.printf("\nSending message [%s] to [%d] ..... please wait\n", this.message, this.phoneNumbers[index]);
                    System.out.printf("\nMessage successfully sent.");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred - Invalid index.");
        } catch(InputMismatchException e) {
            System.out.println("Exception occurred - Data type mismatch. Check the data type and try again");
        } catch(NullPointerException e) {
            System.out.println("Exception occurred - The database of mobile numbers is empty.");
        } catch(Exception e) {
            System.out.println("Exception occurred - " + e.getMessage());
        }
    }
}
