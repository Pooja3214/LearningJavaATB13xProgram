package Task_9July;

public class GenericException {
    public static void main(String[] args) {

        int n=50;
        String s=null;
        char c=s.charAt(1);
        try{
            System.out.println(c);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

