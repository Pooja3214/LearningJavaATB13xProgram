package ex_07_UserInput;

import java.util.Scanner;

public class Lab_UserInput_Scanner {

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter the age:");

        int age= scanner.nextInt();

        String vote=age>=18?"Yes,vote":"No";

        System.out.println(vote);


        System.out.println("Enter teh string:");
        String s=scanner.next();
        System.out.println(s);

        System.out.println("Enter the double");
double d=scanner.nextDouble();
        System.out.println(d);
    }
}
