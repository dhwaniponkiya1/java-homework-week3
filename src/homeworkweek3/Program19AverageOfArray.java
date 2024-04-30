package homeworkweek3;

/**
 * Write a Java program to calculate the average value of array elements.
 */
public class Program19AverageOfArray {
    static int arr[] = {12, 3, 4, 15};
    static int sum = 0;

    static float averageOfArray() {
        for (int num : arr) {
            sum += num;
        }

        float average = sum / arr.length;
        return average;
    }

    public static void main(String[] args) {
        System.out.println("Average of array is "
                + averageOfArray());
    }
}
