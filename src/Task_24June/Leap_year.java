package Task_24June;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year=sc.nextInt();

        if(year<=0)
        {
            System.out.println("Enter valid year");
        }else if((year%4==0 && year%100!=0) || year%400==0)
        {
            System.out.println("Leap year " +year);
        }else
        {
            System.out.println("Not a leap year "+year);
        }
    }
}
