package homeworkweek3;

import java.util.Scanner;

/**
 * WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 *  HRA = basic salary 10%
 *  DA = Basic salary 8%
 *  TA = Basic salary 9%
 *  PF= Basic salary 20%
 *  Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format
 * _______________________________
 * | Salary Slip |
 * |______________________________|
 * | Employee Id : 2564 |
 * | Employee Name : Jay |
 * |______________________________|
 * | Basic Salary : 25000.0 |
 * | HRA 10% : 2500.0 |
 * | TA 8% : 2250.0 |
 * | DA 9% : 2000.0 |
 * | PF - 20& : 5000.0 |
 * |______________________________|
 * | Gross Salary : 26750.0 |
 * |===========================|
 */

public class Program5SalarySlip {

    public static float[] calcSalary(float bs) {
        float hra, da, ta, pf, grossSalary;
        hra = (bs * 10) / 100;
        da = (bs * 8) / 100;
        ta = (bs * 9) / 100;
        pf = (bs * 20) / 100;
        grossSalary = (bs + hra + ta + da) - pf;

        float[] salary = {bs, hra, da, ta, pf, grossSalary};
        return salary;
    }

    public static void printSalary(float[] salary, int empID,String empName){
        System.out.println("---------------------------------");
        System.out.println("|                               |");
        System.out.println("|-----------Salary Slip---------|");
        System.out.println("|                               |");
        System.out.println("---------------------------------");
        System.out.println("|     Employee ID   :      "+empID+"   |");
        System.out.println("|     Employee Name :     "+empName+" |");
        System.out.println("---------------------------------");
        System.out.println("|     Basic Salary  :  "+salary[0]+"  |");
        System.out.println("|      HRA 10%      :  "+salary[1]+"   |");
        System.out.println("|      DA 8%        :  "+salary[2]+"   |");
        System.out.println("|      TA 9%        :  "+salary[3]+"   |");
        System.out.println("|      PF -20%      :  "+salary[4]+"   |");
        System.out.println("---------------------------------");
        System.out.println("|     Gross Salary  :  "+salary[5]+"  |");
        System.out.println("---------------------------------");
        System.out.println("---------------------------------");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID");
        String empID = sc.nextLine();
        int id = Integer.parseInt(empID);
        System.out.println("Enter Employee Name");
        String empName = sc.nextLine();

        System.out.println("Enter Basic Salary");
        Float basicSalary = sc.nextFloat();
        sc.close();

        printSalary(calcSalary(basicSalary), id, empName);

    }
}
