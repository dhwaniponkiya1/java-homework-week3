package homeworkweek3;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry, using if else
 */

public class Program8PrintCity {

    public static String getCity(char letter) {
        String city = "";

        if (Character.toString(letter).matches("^[a-fA-F]*$")) {

            if (letter == 'a' || letter == 'A')
                city = "Armagh";
            else if (letter == 'b' || letter == 'B')
                city = "Bath";
            else if (letter == 'c' || letter == 'C')
                city = "Cambridge";
            else if (letter == 'd' || letter == 'D')
                city = "Doncaster";
            else if (letter == 'e' || letter == 'E')
                city = "Exeter";
            else if (letter == 'f' || letter == 'F')
                city = "Facit";
            else
                System.out.println("invalid input");
        } else
            System.out.println("invalid input");
        return city;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Alphabet from A-F "); //input of number
        char letter = sc.next().charAt(0);
        sc.close();

        System.out.println("City: " + getCity(letter));
    }
    }
