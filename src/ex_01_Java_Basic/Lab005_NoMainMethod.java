package ex_01_Java_Basic;

public class Lab005_NoMainMethod {

    //Without main method, program will not run
    /*// One programs has multiple main method but there parameters should be different
    // and only one main method will be recognized
    by JVM*/

    public static void main(String[] Hello) {
        System.out.println("diffrent parameters in main method also run");
        main(10);
    }

    public static void main(int i) {
        System.out.println(i);
    }
}
