package ConditionFlowPratice;

import java.util.Scanner;

public class MulTable {
    static void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input number ");
        int a = scanner.nextInt();
        for(int i =0 ;i<=a;i++){
            System.out.println(a + " X "+ i +" = "+i*a);
        }
    }
}
