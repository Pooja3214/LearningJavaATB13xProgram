package ex_06_TypeCasting;

public class Lab029_Narrowing {

    public static void main(String[] args) {

        int val  = 300;
//        byte b = val; // Narrowing (int -> byte) - Implicit Casting is not allowed.
        byte b1 = (byte)val; // Narrowing (int -> byte) - Explicit Casting is not allowed.
        // Data Loss.
        System.out.println(b1);
    }
}
