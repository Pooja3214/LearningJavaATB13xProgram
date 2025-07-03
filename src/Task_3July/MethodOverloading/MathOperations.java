package Task_3July.MethodOverloading;

public class MathOperations {

    void multiply(int a, int b)
    {
        System.out.println("Two numbers multiplication: "+ (a*b));

    }

    void multiply(int a,int b, int c)
    {
        System.out.println("Three numbers multiplication: "+(a*b*c));

    }
    public static void main(String[] args) {
        MathOperations m=new MathOperations();
        m.multiply(3,5);
        m.multiply(4,5,6);
    }
}
