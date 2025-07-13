package Task_9July;

public class TryMultipleException {
    public static void main(String[] args) {
        int i=78;

        String s=null;

        int num[]={4};

        try{
            int result=i/0;
            System.out.println(result);
            System.out.println(s.length());
            System.out.println(num[4]);
        }catch (ArithmeticException e)
        {
            throw e;
        }catch (NullPointerException e)
        {
            throw e;
        }catch (ArrayIndexOutOfBoundsException e)
        {
            throw e;
        }
    }
}
