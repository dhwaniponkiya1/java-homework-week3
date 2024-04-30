package homeworkweek3;

import java.util.Scanner;

/**
 * Write a program that tells us input value is number or an alphabet or symbol.
 */
public class Program12CheckNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character");
        char ch = sc.next().charAt(0);      // Declare a variable to store a single character.

        /* Checks whether it is an alphabet */
        if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z'))
            System.out.println("This is an alphabet.");  // Print message for alphabet.
        else if(ch>='0' && ch<='9') /* whether it is digit */
            System.out.println("This is a digit.");  // Print message for digit.
        else /* Else special character */
            System.out.println("This is a special character.");  // Print message for special character.
    }
}
