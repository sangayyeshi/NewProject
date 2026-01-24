package DataTypesPractice;

import java.util.Scanner;

public class DisplayCurrentTimeInGmt {
    static  void  main(){
        Scanner input = new Scanner(System.in);

        System.out.print("Input the time zone offset to GMT: ");
        long timeZoneChange = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        System.out.println(" current milliseconde from system " + totalMilliseconds);
        long totalSeconds = totalMilliseconds / 1000;
        System.out.println(" total second / 1000 result " + totalSeconds);
        long currentSecond = totalSeconds % 60;

        long totalMinutes = totalSeconds / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = ((totalHours + timeZoneChange) % 24);
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
    }

