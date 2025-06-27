package Test_27June;

import java.util.Scanner;

public class Age_Status {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");

if(!sc.hasNextInt())
{
    System.out.println("Please enter integer no.");
}else {
    int age=sc.nextInt();

    if(age<0)
    {
        System.out.println("Please enter age valid range!");
    }

    if(age>=0 && age<=12)
    {
        System.out.println("Child");
    }else if(age>=13 && age<=19)
    {
        System.out.println("Teenager");
    }else if(age>=20 && age<=64)
    {
        System.out.println("Adult");
    }else{
        System.out.println("Senior Citizen");
    }
}

    }
}
