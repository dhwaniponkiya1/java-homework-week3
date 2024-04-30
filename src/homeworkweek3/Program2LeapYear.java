package homeworkweek3;

import java.util.Scanner;

/**
 * Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?
 */

public class Program2LeapYear {

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;

        // If year is divisible by 4
        if (year % 4 == 0) {
            isLeapYear = true;

            // To identify whether it is a
            // century year or not
            if (year % 100 == 0) {
                // Checking if year is divisible by 400
                // therefore century leap year
                if (year % 400 == 0)
                    isLeapYear = true;
                else
                    isLeapYear = false;
            }
        } else               // If year is not divisible by 4
            isLeapYear = false;

        return isLeapYear;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year ");
        int year = sc.nextInt();
        sc.close();

        boolean isLeapYear = isLeapYear(year);

        if (isLeapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
