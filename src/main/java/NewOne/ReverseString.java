package NewOne;

import java.util.Scanner;

public class ReverseString {
    static void  main(){

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input  any string : ");
        char[] letters = scanner.nextLine().toCharArray();
        System.out.println("Reversed String : ");
        for( int i= letters.length-1; i>=1; i--){
            System.out.print(letters[i]);

        }




    }
}
