package Task_24June;

import java.util.Scanner;

public class Smallest_Number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first no.");
        int x=scanner.nextInt();

        System.out.println("Enter second no.");
        int y=scanner.nextInt();

        System.out.println("Enter third no.");
        int z=scanner.nextInt();

        if(x<y && x<z)
        {
            System.out.println("Smallest number is "+x);
        }else if(y<x && y<z)
        {
            System.out.println("Smallest number is "+y);
        }else
        {
            System.out.println("Smallest number is "+z);
        }
    }
}
