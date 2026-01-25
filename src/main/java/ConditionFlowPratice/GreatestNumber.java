package ConditionFlowPratice;

import java.util.Scanner;

public class GreatestNumber {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the 1st number : " );
        int num1 = scanner.nextInt();
        System.out.println("Input the 2nd number : " );
        int num2= scanner.nextInt();
        System.out.println("Input the 3rd number : " );
        int num3= scanner.nextInt();
        // condition start checking the numbers
        if(num1>num2)
            if (num2>num3){
                System.out.println("The greatest " + num1);
            }
        if(num2>num1)
            if (num2>num3){
                System.out.println("The greatest " + num2);
            }
        if(num3>num1)
            if (num3>num2){
                System.out.println("The greatest " + num3);
            }


    }
}
