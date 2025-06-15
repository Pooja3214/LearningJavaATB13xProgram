package Programs;

public class Increment_Decrement {

    public static void main(String[] args) {
        // 1st program
     /*   int a = 5;

        int b = a++;

        System.out.println("a: " + a + ", b: " + b);  //a=6 b=5*/

        // 2nd program
/*
        int i = 1;

        i = i++ + ++i;

        System.out.println(i); // ?  4*/

        // 3rd program

//        int x = 5;
//
//        System.out.println(x++ + ++x); // ? 12
//

        // 4th program
   /*     int x = 5;

        System.out.println(++x); // Output: ? 6

        System.out.println(x++); // Output: ? 6

        System.out.println(x);   // Output: ? 7*/

        // interview qa

     /*   int a = 5;

        int b = a++ + ++a;

        System.out.println("a: " + a); // Output: ? 7

        System.out.println("b: " + b); // Output: ? 12*/

       // interview qa
/*

        int x = 5;

        int y = x++ + ++x + x++ + ++x;

        System.out.println("x = " + x + ", y = " + y); //x=9 y= 28
*/




        int x = 5;

        int y = x++ + ++x + x++ + ++x;

        System.out.println("x = " + x + ", y = " + y);
    }
}
