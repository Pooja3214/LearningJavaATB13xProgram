package Test26June;

import java.util.Scanner;

public class StringOperations {
    public static void main(String[] args) {

//        Scanner sc=new Scanner(XSystem.in);

        System.out.println("Enter string: ");
        String s="Hello";
//        String s=sc.next();

        //concatenation
        String s1= s.concat(" World");
        System.out.println(s1);

        //length
        System.out.println("String length: " + s1.length());

        //substring
        System.out.println(s1.substring(6,11));

        //Character Extraction
        System.out.println(s1.charAt(0));
    }
}
