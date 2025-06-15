package ex_08_If_Conditions;

import java.util.Scanner;

public class Lab_IfCondition {
    public static void main(String[] args) {

        //Input from CLI
        /*int age = Integer.parseInt(args[0]);
        if (age > 18){
            System.out.println("Yes you can go to GOA!");
        }else {
            System.out.println("You can't Go to GOA!!");




        }*/
        //Input from Scanner
        System.out.println("Enter the age");
        Scanner scanner=new Scanner(System.in) ;
        int ages = scanner.nextInt();

        if(ages > 18){
            System.out.println("Allowed to Vote!");
        }
    }
}
