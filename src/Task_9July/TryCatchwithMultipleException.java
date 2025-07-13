package Task_9July;

public class TryCatchwithMultipleException {
    public static void main(String[] args) {
        int n=50;
        int a[] = {10,320};

   try{
       System.out.println(+(n/0));
       System.out.println(+ a[2]);
   }catch (ArithmeticException e)
   {
       System.out.println("Arithmetic Exception, No. not divide by 0");
   }catch (ArrayIndexOutOfBoundsException e)
   {
       System.out.println("ArrayIndexOutOfBoundsException: invalid array index ");
   }

    }
}
