package ConditionFlowPratice;

import java.util.Scanner;

public class CheckingPosOrNeg {

    static void main(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input  number : " );
        int input =scanner.nextInt();
        if(input>0){
            System.out.println("Number is positive");
        }else if(input<0){
            System.out.println("Number is negative");
        }else{
            System.out.println("number is zero");
        }
    }
}
