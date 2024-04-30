package homeworkweek3;

import java.util.Scanner;

/**
 * Write a java program to input any number and find out if it’s odd or even
 */
public class Program6FIndOddEven {

    public static String checkOddEven(int n){
        if(n % 2 == 0)          //calculate mod with 2 to check odd or even
            return "Even";
        else
            return "Odd";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number "); //input of number
        int number = sc.nextInt();
        sc.close();
        System.out.println(checkOddEven(number));
    }
}
