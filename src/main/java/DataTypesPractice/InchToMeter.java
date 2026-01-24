package DataTypesPractice;

import java.util.Scanner;

public class InchToMeter {
    static void main(){
      //Write a Java program that reads a number in inches and converts it to meters.
        //Note: One inch is 0.0254 meter.
        //Test Data
        //Input a value for inch: 1000
        //Expected Output :
        //1000.0 inch is 25.4 meters
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a value for inch : ");
        double value = scanner.nextDouble();
        double in = 0.0254;
        double result = in*value;
        System.out.println( value+ " inch is " +result  +" meter ");


    }
}
