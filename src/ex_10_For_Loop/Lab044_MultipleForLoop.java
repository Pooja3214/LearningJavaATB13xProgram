package ex_10_For_Loop;

public class Lab044_MultipleForLoop {
    public static void main(String[] args) {
        for (long i = 1l; i < 10; i++) {
            System.out.println(i);
        }
        for (float f = 0.0f; f < 10.67; f++) {
            System.out.println("Hi,Float -> " + f);
        }

        for (int i = -1; i < -10 ; i--) {
            System.out.println(i);
        } //No output as -1 is greater than -10


        //multiple for loops allowed

        // intialization can be done outside loop too
        int i = 10;
        for (; i > 0; i--) {
            System.out.println(i);
        }
    }
}
