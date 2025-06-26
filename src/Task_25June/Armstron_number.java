package Task_25June;

import java.util.Scanner;

public class Armstron_number {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter no.");
        int n=scanner.nextInt();
        int original_num=n;
int sum=0;
        int digit_length=0;
        while(n!=0)
        {
            n=n/10;
            digit_length++;
        }
       n= original_num;
        while(n!=0)
        {
            int digit=n%10;
            sum= (int) (sum+Math.pow(digit,digit_length));
           n=n/10;
        }

        if(sum==original_num)
        {
            System.out.println("Armstrong no. "+original_num);
        }else {
            System.out.println("Not Armstrong no. "+original_num);
        }

    }
}
