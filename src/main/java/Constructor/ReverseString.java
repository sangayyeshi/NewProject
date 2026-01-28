package Constructor;

import java.util.Scanner;

public class ReverseString {
     static  void main(){
         Scanner sc=new Scanner(System.in);
         System.out.println(" Enter you name ");
         String A=sc.next();
         /* Enter your code here. Print output to STDOUT. */
         String reverse = new StringBuilder(A).reverse().toString();
         if(A.equals(reverse)){
             System.out.println("Yes");
         }else{
             System.out.println("No");
         }
     }

    }

