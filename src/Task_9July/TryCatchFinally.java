package Task_9July;

public class TryCatchFinally {
    public static void main(String[] args) {

        String s="12";
        char c=s.charAt(3);

        try{
            System.out.println(c);
        }catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutofBounndexception occured: string index invalid");
        }finally {
            System.out.println("final block will execute even if there is an exception");
        }
    }
}
