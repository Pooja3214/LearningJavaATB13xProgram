package JavaPrograms;

import java.util.Scanner;

public class Lab002_UserInputExample {

    public static void main(String[] args) {
        System.out.println("Enter inputs from user");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter first no.");
        int a=  sc.nextInt();

        System.out.println("Enter second no.");
        int b=sc.nextInt();

        System.out.println("sum " + (a+b));
        sc.close();
    }
}
