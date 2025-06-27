package Test_27June;

import java.util.Scanner;

public class Number_Divisible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");

if(!sc.hasNextInt())
{
    System.out.println("Please enter valid no.!");
}else {
    int n=sc.nextInt();
    if (n % 5 == 0 && n % 11 == 0) {
        System.out.println("Number is divisible by 5 and 11");
    } else {
        System.out.println("Number not divisible by 5 and 11");
    }
}

}
    }

