package Task_3July.MethodOverloading;

public class Calculator {
    int a=6;
    int b=8;
    void addNumbers()
    {
        System.out.println(a+b);
    }

    void addNumbers(double x, double y)
    {
        System.out.println(x+y);
    }

    public static void main(String[] args) {
        Calculator sum=new Calculator();
        sum.addNumbers();
        sum.addNumbers(56.7,8.6);
    }
}

