package Task_25June;

import java.util.Scanner;

public class Palindrome_Number {

    public static int reverse(int n)
    {
        int rev=0;
        while(n>0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
       // System.out.println(reverse);
        return rev;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=scanner.nextInt();
        int rev_no = reverse(n);

        if (rev_no == n) {

            System.out.println("No. is palindrome: " +n);
        }
        else {
            System.out.println("No. is not palindorme: " +n);
        }
    }
}
