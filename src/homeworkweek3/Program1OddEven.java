package homeworkweek3;

import java.util.Scanner;

/**
 * Write a java program that tells us that Input number is odd or even?
 *  HINT: use ternary operator (? :)
 */

public class Program1OddEven {

    public static String checkOddEven(int n){
        return (n % 2 == 0) ? "Even" : "Odd"; //calculate mod with 2 to check odd or even
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number "); //input of number
        int number = sc.nextInt();
        sc.close();
        System.out.println(checkOddEven(number));
    }
}
