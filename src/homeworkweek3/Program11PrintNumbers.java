package homeworkweek3;

/**
 * Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately.
 */
public class Program11PrintNumbers {

    public static void dividedBy3and5() {

        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    System.out.print(i + "\t");
                    System.out.println(i);
                } else {
                    System.out.println(i);
                }
            } else {
                if (i % 5 == 0)
                    System.out.println("\t" + i);
            }
        }
    }


    public static void main(String[] args) {
        dividedBy3and5();
    }
}
