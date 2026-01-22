package NewOne;

import java.util.Scanner;

public class InputTwoNumbers {



    static void main(){
        // we have creat the scanner object 25*5 =125
        Scanner  scanner  = new Scanner(System.in);
        System.out.println(" input first number : ");
         int a = scanner.nextInt();

        System.out.println(" input second  number : ");
        int b = scanner.nextInt();
        int c =a*b;
      String n =" this is  the product ";
        System.out.println(  n.concat(String.valueOf(c)));


    }
}
