package ex_08_If_Conditions;

import java.util.Scanner;

public class Lab_if_Else {

    public static void main(String[] args) {
        System.out.println("Enter the age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        int a = 10;

        if(age <= 18){
            System.out.println("Not allowed to vote!");
        }else{
            System.out.println("Allowed to vote");
        }
    }
}
