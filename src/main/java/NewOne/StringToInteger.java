package NewOne;

import java.util.Scanner;

public class StringToInteger {
    static  void main(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" input string are ");
        String s = scanner.nextLine();
        int result =Integer.parseInt(s);
        System.out.println(result);
    }
}
