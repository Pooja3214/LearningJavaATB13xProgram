package TestCoding;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Typecasting {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number");
        byte b=scanner.nextByte();

        //Widening

        int i= b;
        System.out.println(i); //Implicit Widening Casting

        int i2= (int)b;  //explicit Widening Casting


        //Narrowing
        float f= scanner.nextFloat();
        int i1= (int)f;
        System.out.println("i1"); // Implicit narrowing


    }
}

