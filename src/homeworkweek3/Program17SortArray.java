package homeworkweek3;

import java.util.Arrays;

/**
 *  Write a Java program to sort a numeric array and a string array.
 */

public class Program17SortArray {

    public static void sortIntArray(int[] arr){
        Arrays.sort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    public static void sortStringArray(String[] arr){
        Arrays.sort(arr);
        for (String n : arr) {
            System.out.print(n + " ");
        }
    }


    public static void main(String[] args) {
        int[] arr1 = {-2, 23, 788, 45, 13, 30, 77, 71, 0};

        String[] arr2 = {"Java", "Python", "PHP", "C#", "C Programming", "C++"};
        sortIntArray(arr1);
        System.out.print("\n");
        sortStringArray(arr2);

    }

}
