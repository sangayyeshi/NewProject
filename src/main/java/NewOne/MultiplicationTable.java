package NewOne;

import java.util.Scanner;

public class MultiplicationTable {
    static void main(){
        //Write a Java program that takes a number as input and prints
        // its multiplication table up to 10
        // input number as 8
        // taking input from user we use scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number 8: ");
        int num1 = scanner.nextInt();
       //Use a loop to calculate and print the multiplication table for the input number
        for (int i = 0; i < 10; i++) {
            // Calculate and print the result of num1 multiplied by (i+1)
            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
        }

        }

    }


