package ex_04_Operators;

public class Lab017_Logical_Operators {

    public static void main(String[] args) {
        boolean a = true;
        System.out.println(!a); //fasle

        boolean b = true;
        System.out.println(!!b); //true

        boolean c= true || false;

        System.out.println(c); //true


        boolean c1= true && false;
        System.out.println(c1); // false
    }
}
