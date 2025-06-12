package Programs;

public class EvenOdd_TernaryOperators {
    public static void main(String[] args) {

        int a=19;

        String c= (a%2==0)?"Even":"Odd";

        System.out.println("Number is "+ c);

        a= 20;
        String s1= (a%2==0)?"Even":"Odd";
        System.out.println("Number is " +s1);

    }
}
