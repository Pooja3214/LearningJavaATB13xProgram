package ex_04_Operators;

public class Lab_Incre_Decrement_OP {
    public static void main(String[] args) {

        //1st Program
       /* int a = 10;
        int b = ++a; // 10+1 assigned // pre - increment
        System.out.println(a); //11
        System.out.println(b);//11*/

        //2nd Program
     /*   int a= 10;
        System.out.println(++a); //11
        System.out.println(a); //11


        // // POST increment  = Print first and then increase
        int a_post = 10;
        System.out.println(a_post++); //10
        System.out.println(a_post); //11*/

        // Line No. |  a | Exp
        //  5 |  10 | NA
        //  6 |  11 | 10
        //  7 |  11 | NA
        //  8 | NA | 10

        //3rd Program
  /*      int a = 10;
        System.out.println(a++ + a);   //  21*/

        int a = 10;
        int result_post = a--;
        System.out.println(result_post); //  10
        System.out.println(a); // 9
    }
}
