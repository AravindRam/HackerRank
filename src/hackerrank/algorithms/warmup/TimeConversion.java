package hackerrank.algorithms.warmup;

import java.util.Scanner;

/*

Given a time in AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00 AM on a 12-hour clock and 00:00:00 on a 24-hour clock. Noon is 12:00:00 PM on a 12-hour clock and 12:00:00 on a 24-hour clock.

Input Format

A time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 01≤hh≤12.

Sample Input

Convert and print the given time in 24-hour format, where 00≤hh≤23.

Sample Output

07:05:45PM

Explanation

19:05:45 

*/

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String[] str = time.split(":");
        int hour = Integer.parseInt(str[0]);
        if(str[2].charAt(2) == 'A'){
            if(hour == 12){
                System.out.println("00"+":"+str[1]+":"+str[2].substring(0,2));            
            }
            else{
                System.out.println(String.format("%02d", hour)+":"+str[1]+":"+str[2].substring(0,2));            
            }
        }
        if(str[2].charAt(2) == 'P'){
            if(hour == 12){
                System.out.println("12"+":"+str[1]+":"+str[2].substring(0,2));            
            }
            else{
                System.out.println(hour+12+":"+str[1]+":"+str[2].substring(0,2));            
            }

        }
        in.close();
    }
}
