package Task_25June;

import java.util.Scanner;

public class LoanEligible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age: ");
        int age=sc.nextInt();

        if(age<18)
        {
            System.out.println("Please enter valid age!");
        }

        System.out.println("Enter salary: ");
        double salary=sc.nextDouble();

        if(salary <=30000) {
            System.out.println("Enter valid salary! ");
        }

        System.out.println("Enter credit score");
        int credit_score=sc.nextInt();

        if(credit_score<650)
         {
             System.out.println("Enter valid credit score! ");
         }

        if(age>=18 && age<=80)
        {
            if(salary>=30000 && salary>=0)
            {
             if(credit_score>=650 && credit_score<=850)
             {
                 System.out.println("You are eligible for loan");
             }
             else {
                 System.out.println("Not eligible for loan");
             }
            }
        }
    }
}
