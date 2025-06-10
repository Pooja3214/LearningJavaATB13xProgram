package JavaPrograms;

import org.w3c.dom.ls.LSOutput;

public class GradeCalculator {


    public static void main(String[] args) {
        int i = 80;
        char grade;
        if (i >= 90 && i <= 100) {
            grade = 'A';
        }
        else if(i >= 80 && i < 89)
        {
            grade = 'B';
        }
        else if(i >= 70 && i < 79)
        {
            grade = 'C';
        }
        else if(i >= 60 && i < 69)
        {
            grade = 'D';
        }else
        {
            grade = 'E';
        }
        System.out.println("yours grade is " + grade);
    }

}
