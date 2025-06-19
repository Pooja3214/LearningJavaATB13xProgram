package Programs;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        String s1=scan.next();
        String s= s1.toLowerCase();
        String rev="";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }
        if(s.equals(rev))
        {
            System.out.println("String is palindrome");
        }
        else {
            System.out.println("String is not palindrome");
        }

    }

}
