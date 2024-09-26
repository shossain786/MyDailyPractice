package org.saddy.challanges.StringOperation;

import org.saddy.challanges.StringsOperation.ReverseText;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseTextTest {

    public static void main(String[] args) {
        boolean onNext = true;
        String enteredText;
        ReverseText reverseText = new ReverseText();
        while (onNext) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Select option from below: \n" +
            "1. Reverse a Number. \n" +
                    "2. Quite");
            try{
                int choice = scanner.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("Enter A Text To Reverse:- ");
                        scanner = new Scanner(System.in);
                        enteredText = scanner.nextLine();
                        System.out.println("Your output: " + reverseText.reverse(enteredText));
                        break;
                    case 2:
                        onNext = false;
                        break;
                    default:
                        System.out.println("You have selected an invalid option. Please select a correct option.\n");
                        onNext = false;
                }
            } catch (InputMismatchException inputMismatchException) {
                System.out.println("You entered an invalid input. Please try again");
            }
        }
        System.out.println("Existed from the execution");
    }
}
