package Task_25June;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no. of units: ");
        int units=sc.nextInt();
double rate=0;

        if(units<=100)
        {
            rate=.50 * units;
        }else if(units>=101 && units<=200)
        {
            rate=0.75*units;
        }else if(units>=201 && units<=300)
        {
            rate=1.20*units;
        }else {
            rate=1.50*units;
        }
        System.out.println(rate);
    }
}
