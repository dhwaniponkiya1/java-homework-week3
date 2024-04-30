package homeworkweek3;

import java.util.Scanner;

/**
 * Write a java program to input student Name, roll No, and three subjects Math, Science and
 * English marks (marks is between 0 to 100 and if it is out of range print error message “Invalid
 * Input, Marks should between 0 to 100”) and find out total, percentage and result.
 * If he is pass or fail on basis of percentage (pass>=35) and also give them grade if %> = 80 A+,
 * %> = 60 A, %> = 50 B, %> = 35 C And print Mark Sheet in following format
 * _______________________________
 * | |
 * | Mark Sheet |
 * |_______________________________|
 * | Name : Jay |
 * | Roll No: 08 |
 * |_______________________________|
 * | Subjects : Marks |
 * |_______________________________|
 * | Math : 98 |
 * | Science : 90 |
 * | English : 85 |
 * |_______________________________|
 * | Total : 273 |
 * |_______________________________|
 * | Percentage : 91.0 |
 * | Result : Pass |
 * | Grade : A+ |
 * |_______________________________|
 */
public class Program3Marksheet {

    public static String calcGrade(float percent) {
        String grade;
        if (percent >= 80 && percent <= 100)
            return grade = "A+";
        else if (percent >= 60 && percent <= 79)
            return grade = "A";
        else if (percent >= 50 && percent <= 59)
            return grade = "B";
        else if (percent >= 35 && percent <= 49)
            return grade = "C";
        else
            return grade = "D";
    }

    public static void printMarksheet(String studentName, int rollNo, int maths, int science,
                                      int english, float total, float percent, String result, String grade){
        System.out.println("---------------------------------");
        System.out.println("|                               |");
        System.out.println("|-----------Mark Sheet----------|");
        System.out.println("|                               |");
        System.out.println("---------------------------------");
        System.out.println("|     Name          :      "+studentName+" |");
        System.out.println("|     Roll No       :       "+rollNo+"  |");
        System.out.println("---------------------------------");
        System.out.println("|     Subjects      :    Marks  |");
        System.out.println("|     Maths         :      "+maths+"   |");
        System.out.println("|     Science       :      "+science+"   |");
        System.out.println("|     English       :      "+english+"   |");
        System.out.println("---------------------------------");
        System.out.println("|     Total          :    "+total+"  |");
        System.out.println("---------------------------------");
        System.out.println("|     Percentage     :    "+percent+"  |");
        System.out.println("|     Result         :    "+result+"  |");
        System.out.println("|     Grade          :      "+grade+"   |");
        System.out.println("|                               |");
        System.out.println("---------------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maths, science, english;
        float percent, total;
        String grade, result;

        System.out.println("Enter Name ");
        String studentName = sc.nextLine();
        System.out.println("Enter Roll No ");
        int rollNo = sc.nextInt();
        System.out.println("Enter Maths marks ");
        maths = sc.nextInt();
        System.out.println("Enter science marks ");
        science = sc.nextInt();
        System.out.println("Enter english marks ");
        english = sc.nextInt();
        sc.close();

        if (maths >= 0 && maths <= 100 && science >= 0 && science <= 100 && english >= 0 && english <= 100) {
            total = (maths + science + english);
            percent = total / 3;
            if(maths < 35 || science < 35 || english< 35)
                grade = "D";
            else
                grade = calcGrade(percent);
            result = (grade == "D") ? "Fail" : "Pass";

            printMarksheet(studentName, rollNo, maths, science, english, total, percent, result, grade);
        } else
            System.out.println("Enter valid marks in range between 0-100");


    }
}
