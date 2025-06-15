package ex_04_Operators;

public class Lab021_OR_AND_GATE {
    public static void main(String[] args) {
        // || - OR
        int balaji_salary = 12;
        boolean b = !(balaji_salary > 10 || balaji_salary < 5);
        System.out.println(b); // false

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);


        //  And  && // only true && true returns true
        // T || T -> T
        // T || F -> F
        // F || T -> F
        // F || F -> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);
    }
}
