package ex_11_While_Loop;

import java.util.Scanner;

public class Lab051_While_IQ_Factorial {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        if(!scanner.hasNextInt())
        {
            System.out.println("Enter integer number");
            return;
        }


        int num=scanner.nextInt();
 long factorial=1L;

 if(num<0)
 {
     System.out.println("Negative numbers not allowed");
 }
 else if(num>=0)
 {
     for (int i = 1; i <= num; i++) {
         factorial = factorial * i;
     }
 }

        System.out.println("Factorial of " +num + " is: " +factorial);
    }
}
