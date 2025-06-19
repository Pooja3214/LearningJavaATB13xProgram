package Programs;

import java.util.Scanner;

public class Character_vowelConsonant {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s= scan.next();
       // String s=s1.toLowerCase();
        char ch=s.toLowerCase().charAt(0);

        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            System.out.println("Vowel");
        }
        else if(ch>='a'&&ch<='z')
        {
            System.out.println("Consonants");
        }
    }
}
