package Task_9July;

public class ArithemeticException  {

    public static void main(String[] args) {

        int i=20;

        try{
            int result=10/0;
            System.out.println(+result);
        } catch (ArithmeticException  e)
        {
            System.out.println("Number not divide by 0. Check the operation");
        }
    }
}
