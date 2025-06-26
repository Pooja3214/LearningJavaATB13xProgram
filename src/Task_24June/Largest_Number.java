package Task_24June;

import java.util.Scanner;

public class Largest_Number {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first no.");
        int x=scanner.nextInt();

        System.out.println("Enter second no.");
        int y=scanner.nextInt();
        if(x>y)
        {
            System.out.println("Largest no is "+x);
        }else {
            System.out.println("Largest no is "+y);
        }
    }
}
