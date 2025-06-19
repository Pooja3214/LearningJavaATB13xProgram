package Programs;

import java.util.Scanner;

public class GradeCalculate {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your marks");
try {
    double marks = scanner.nextDouble();

    if(marks>100 || marks <0)
    {
        System.out.println("Please enter marks in from 0 to 100");
    }else if (marks >= 90 && marks <= 100) {
        System.out.println("Grade A");
    } else if (marks >= 80 && marks <= 89) {
        System.out.println("Grade B");
    } else if (marks >= 70 && marks <= 79) {
        System.out.println("Grade C");
    } else if (marks >= 60 && marks <= 69) {
        System.out.println("Grade D");
    } else if (marks >= 50 && marks <= 59) {
        System.out.println("Grade E");
    } else {
        System.out.println("Grade F");
    }
}catch (Exception e)
{
    System.out.println("Please enter numeric marks!");
}
    }
}
