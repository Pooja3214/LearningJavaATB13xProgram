package Task_9July;

public class CatchVsGeneric {
    public static void main(String[] args) {
        String s=null;
        char c=s.charAt(1);
        try{
            System.out.println(c);
        }

        // catch specific exception that is mentioned
        catch(NullPointerException e)
        {
            System.out.println("Catch Null pointer exception" +e.getMessage());
        }

        //  catch all exceptions
//        catch (Exception e) {
//            System.out.println("Generic exception"+ e.getMessage());
//        }

    }
}
