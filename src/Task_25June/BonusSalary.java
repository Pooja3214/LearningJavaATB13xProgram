package Task_25June;

import java.util.Scanner;

public class BonusSalary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter years: ");
        int year=sc.nextInt();

        System.out.println("Enter salary: ");
        int salary=sc.nextInt();

        if(year<1)
        {
            System.out.println("No bonus");
        }else if(year>1 && year<=3)
        {
            System.out.println("Bonus is: " + (5*salary)/100);
        }else if(year>=4 && year<=6)
        {
            System.out.println("Bonus is: "+(10*salary)/100);
        }else {
            System.out.println("Bonus is: "+(15*salary)/100);
        }
    }
}
