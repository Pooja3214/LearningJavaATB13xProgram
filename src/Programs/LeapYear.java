package Programs;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the year:");
try {
    long year = scanner.nextLong();

    if (year <= 0) {
        System.out.println("Please enter valid positive year!");
    } else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
        System.out.println(year + " is a leap year");
    } else {
        System.out.println(year + " is not a leap year");
    }
} catch (Exception e)
{
    System.out.println("Please enter a valid numeric year!");
}
    }
}
