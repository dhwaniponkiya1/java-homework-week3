package homeworkweek3;

import java.util.Scanner;

/**
 * Write a Java program to test if an array contains a specific value.
 */
public class Program20ArrayContains {

    static int arr[] = {12, 3, 4, 15};

    static boolean arrayContains(int n) {
        boolean res = false;
        for (int element : arr) {
            if (element == n) {
                res = true;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number to check");
        int n = sc.nextInt();

        System.out.println(arrayContains(n));
    }
}
