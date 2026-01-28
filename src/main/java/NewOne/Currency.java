package NewOne;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {
     static  void main(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter numbee ");
         double payment = scanner.nextDouble();
         scanner.close();
         // for the currecnty that we have  the number format in java
         // Write your code here.
         NumberFormat u = NumberFormat.getCurrencyInstance(Locale.US);
         NumberFormat i = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
         NumberFormat b = NumberFormat.getCurrencyInstance(new Locale("en","BT"));
         b.setMinimumFractionDigits(2);
         b.setMaximumFractionDigits(2);
         NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
         NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);


         String us = u.format(payment);
         String india = i.format(payment);
         String china = c.format(payment);
         String france = f.format(payment);
         String bhutan = b.format(payment);

         System.out.println("US: " + us);
         System.out.println("India: " + india);
         System.out.println("China: " + china);
         System.out.println("France: " + france);
         System.out.println("Bhutan:   " + bhutan);
     }
     }

