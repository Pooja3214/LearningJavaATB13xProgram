package ex_09_SwitchCase;

import java.util.Scanner;

public class Lab032_Switch_Without_Break {
    public static void main(String[] args) {
//without break, this will print next statement where condition match
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter the day num from 1 to 7");
        int day=scanner.nextInt();

        switch(day)
        {
            case 1:
                System.out.println("Monday");

            case 2:
                System.out.println("Tuesday");

            case 3:
                System.out.println("Wednesday");

            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");

            case 6:
                System.out.println("Saturday");

            case 7:
                System.out.println("Sunday");

            default:
                System.out.println("Not allowed");

        }
    }
}
