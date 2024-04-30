package homeworkweek3;

/**
 * Write a Java program to sum values of an array.
 */
public class Program18SumOfArray {

    static int arr[] = { 12, 3, 4, 15 };

    static int sumOfArray(){
        int sum = 0;
        int i;

        for (i = 0; i < arr.length; i++)
            sum += arr[i];

        return sum;
    }


    public static void main(String[] args) {
        System.out.println("Sum of array is "
                + sumOfArray());
    }

}
