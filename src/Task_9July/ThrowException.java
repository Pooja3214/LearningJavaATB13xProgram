package Task_9July;

public class ThrowException  {

    public static void main(String[] args) {
        int n=80;

        try{
            int result=n/0;
            System.out.println(+result);
        } catch (ArithmeticException e)
        {
            throw e;
        }
    }
}
