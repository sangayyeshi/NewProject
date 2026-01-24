package DataTypesPractice;

import java.util.Scanner;

public class CovertMinToYear {
    static  void  main(){
        // there is some mistake in code
        double min =525600;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of minutes: ");
        double in = input.nextDouble();
        long years = (long) (min/in);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }
    }

