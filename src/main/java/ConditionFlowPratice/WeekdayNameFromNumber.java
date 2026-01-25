package ConditionFlowPratice;

import java.util.Scanner;

public class WeekdayNameFromNumber {
    static void main(){
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int month = in.nextInt();

        System.out.println(getMonthName(month));
    }



        public static  String getMonthName(int month){
            String monthName = "";
            switch (month) {
                case 1: monthName = "jan"; break;
                case 2: monthName = "feb"; break;
                case 3: monthName = "mar"; break;
                case 4: monthName = "apr"; break;
                case 5: monthName = "may"; break;
                case 6: monthName = "june"; break;
                case 7: monthName = "july"; break;
                case 8: monthName = "agu"; break;
                case 9: monthName = "spt"; break;
                case 10: monthName = "oct"; break;
                case 11: monthName = "nov"; break;
                case 12: monthName = "dec"; break;
                default:monthName = "Invalid month12 range";
            }
            return monthName;

        }
}
