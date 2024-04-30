package homeworkweek3;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */

public class Program4NumberOfDaysInMonth {

    static boolean isValidYear;

    public static boolean isValidYear(int year) {
        if (year >= 1 && year <= 9999)
            return true;
        else
            throw new IllegalArgumentException("Year is not in range 1-9999");
    }

    public static int isValidMonth(int month) {
        if (month >= 1 && month <= 12)
            return 1;
        else
            return -1;
    }

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (isValidYear) {

            // If year is divisible by 4
            if (year % 4 == 0) {
                isLeapYear = true;

                // To identify whether it is a century year or not
                if (year % 100 == 0) {
                    // Checking if year is divisible by 400, therefore century leap year
                    if (year % 400 == 0)
                        isLeapYear = true;
                    else
                        isLeapYear = false;
                }
            } else {
                return false;
            }
            return isLeapYear;
        } else {
            System.out.println("Invalid input. Enter year in range of 1-9999.");
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (isValidYear) {
            int numberOfDays;
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                    numberOfDays = 31;
                    break;
                case 4:
                case 6:
                case 8:
                case 10:
                case 12:
                    numberOfDays = 30;
                    break;
                case 2:
                    numberOfDays = isLeapYear(year) ? 29 : 28;
                    break;
                default:
                    throw new IllegalArgumentException("Month is not in range 1-12");
            }
            return numberOfDays;
        } else {
            throw new IllegalArgumentException("Year is not in range 1-9999");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year ");
        int year = sc.nextInt();
        isValidYear = isValidYear(year);

        System.out.println("Enter month ");
        int month = sc.nextInt();
        if(isValidMonth(month) == -1){
            throw new IllegalArgumentException("Month is not in range");
        }
        sc.close();

        System.out.println("Number of days: "+getDaysInMonth(month, year));
    }
}
