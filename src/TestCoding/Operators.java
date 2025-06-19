package TestCoding;

public class Operators {

    public static void main(String[] args) {
        int a=2;
        int b=4;
        int c=5;

        //Arithemetic operators

        System.out.println(a+b); //Addition
        System.out.println(a*b); //Multiplication
        System.out.println(a/b);// Divisiom
        System.out.println(a-b);// SUbtraction
        System.out.println(a%b); // Modulus

        //Unary operators;
        System.out.println(+a);
        System.out.println(-a);
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println(--a);

        //Assignment Oprators
       float  f=4;
      f+=3;
      f/=4;
      f-=5;
      f*=6;
      f%=7;

      //Relational Operators;

        boolean d = a > b;
        d=a<b;
        d=a==b;
        d=a>=b;
        d=a<=b;

//Logical Opeartors

        boolean c2= true || false; //OR

        System.out.println(c2); //true


        boolean c1= true && false; //AND
    //!- not

        //instance of
        String s1 = new String("Pooja");
        System.out.println(s1 instanceof String);

        //Ternary
        int age =19;
        String vote=age>18?"Yes,you can vote":"N0, you can't vote";

    }
}
