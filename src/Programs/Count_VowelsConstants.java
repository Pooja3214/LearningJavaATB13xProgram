package Programs;

import java.util.Scanner;

public class Count_VowelsConstants {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String s1= scan.next();
        String s=s1.toLowerCase();
        int vow=0; int cons=0;

        for (int i=0;i<s.length();i++)
        {
         char ch=s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
            ) {
                vow++;
            }else if((ch>='a'&&ch<='z')){
                cons++;
            }

        }
        System.out.println("Vowels count: " +vow);
        System.out.println("Consonants count: " +cons);
    }
}
