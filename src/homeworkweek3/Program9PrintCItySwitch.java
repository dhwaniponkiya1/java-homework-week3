package homeworkweek3;

import java.util.Scanner;

/**
 * Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry, using switch
 */
public class Program9PrintCItySwitch {

    public static String getCity(char letter){
        String city="";

        if (Character.toString(letter).matches("^[a-fA-F]*$")) {
            switch (letter) {
                case 'a':
                case 'A':
                    city = "Armagh";
                    break;
                case 'b':
                case 'B':
                    city = "Bath";
                    break;
                case 'c':
                case 'C':
                    city = "Cambridge";
                    break;
                case 'd':
                case 'D':
                    city = "Doncaster";
                    break;
                case 'e':
                case 'E':
                    city = "Exeter";
                    break;
                case 'f':
                case 'F':
                    city = "Facit";
                    break;
                default:
                    throw new IllegalArgumentException("Invalid");
            }
        } else {
            System.out.println("invalid input");
        }
        return city;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Alphabet from A-F "); //input of number
        char letter = sc.next().charAt(0);
        sc.close();

        System.out.println("City: "+ getCity(letter));
    }


}
