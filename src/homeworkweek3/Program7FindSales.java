package homeworkweek3;

import java.util.Scanner;

/**
 * Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%
 */
public class Program7FindSales {

    public static int findCommission(int amt) {
        if (amt >= 50000)
            return 35;
        else if (amt >= 30000 && amt <= 49999)
            return 20;
        else if (amt >= 20000 && amt <= 29999)
            return 10;
        else if (amt >= 10000 && amt <= 19999)
            return 5;
        else if (amt >=1 && amt < 10000)
            return 2;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sales ID "); //input of number
        int id = sc.nextInt();
        System.out.println("Enter Seller's Name "); //input of number
        String name = sc.next();
        System.out.println("Enter Sales Amount "); //input of number
        int amt = sc.nextInt();
        System.out.println("Enter Salary Basic "); //input of number
        float salary = sc.nextFloat();
        sc.close();

        int commission = findCommission(amt);

        System.out.println("Seller ID: "+id);
        System.out.println("Seller Name: "+name);
        System.out.println("Sales Amount: "+amt);
        System.out.println("Salary Basic: "+salary);
        System.out.println("Commission: "+commission);
    }
}
