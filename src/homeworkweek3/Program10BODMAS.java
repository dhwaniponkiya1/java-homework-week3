package homeworkweek3;

import java.util.Scanner;

/**
 * Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)
 */
public class Program10BODMAS {

    public static float calc(int a, int b, char symbol) {
        if (symbol == '+')
            return a + b;
        else if (symbol == '-')
            return a - b;
        else if (symbol == '*')
            return a * b;
        else
            return a / b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number"); //input of number
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter any symbol(+, -, *, /)"); //input of number
        char symbol = sc.next().charAt(0);
        sc.close();

        if (Character.toString(symbol).matches("^[-*+/]+")) {
            float result = calc(a,b,symbol);
            System.out.println(result);
        } else {
            System.out.println("Invalid input");
        }

    }
}
