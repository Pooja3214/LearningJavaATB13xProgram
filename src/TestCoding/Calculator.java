package TestCoding;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
Scanner scan= new Scanner(System.in);
        System.out.println("Enter first number");
int a=scan.nextInt();
        System.out.println("Enter second number");
int b= scan.nextInt();

        int res;
        System.out.println("Enter operator");
char c= scan.next().charAt(0);
        switch(c)
        {
            case '+':
                res=a+b;
                System.out.println(res);
                break;

            case '-':
                 res=a-b;
                System.out.println(res);
                break;

            case '*':
                res=a*b;
                System.out.println(res);
                break;

            case '/':
                if(b!=0) {
                    res = a / b;
                    System.out.println(res);
                }
                else {
                    System.out.println("Error");
                }
                break;

            default:
                System.out.println("Invalid!");
                break;
        }
    }
}
