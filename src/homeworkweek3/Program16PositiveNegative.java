package homeworkweek3;

import java.util.Scanner;

/**
 * Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO”
 */

public class Program16PositiveNegative {

    public static void checkNumber(int n){
        if(n>0)
            System.out.println(n + " is positive number.");
        else if(n<0)
            System.out.println(n + " is negative number.");
        else
            System.out.println(n + " is a zero.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        checkNumber(n);
    }
}
