package DataTypesPractice;

import java.util.Scanner;

public class Bmi {
    static void main(){

        // date need for the bmi calculation
        //1 inch = 0.0254
        // 1 pounds =0.45359237
        // formula for bmi = weight(kg)/height(m)2

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the weight : ");
        double weight= scanner.nextInt();
        System.out.println("enter the height : ");
        double height= scanner.nextInt();
        double bmi = (weight*0.45359237)/(height*0.0254*height*0.0254);

        System.out.println("Body Mass Index is "+ bmi +"\n" );

    }
}
