package Task_27June;

import java.util.Scanner;

public class Days_conversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no. of days");

        if(!sc.hasNextInt())
        {
            System.out.println("Enter valid days!");
        }else {
            int total_days=sc.nextInt();

            if(total_days<0)
            {
                System.out.println("Days not in negative. Please enter positive days");
            }else {
                int year=total_days / 365;
                int remaining_days= total_days % 365;

                int months= remaining_days / 30;
                int days= remaining_days % 30;
                System.out.println("Total days: " + year + " years,"+months +" months,"+days+" days.");

            }
        }



    }
}
