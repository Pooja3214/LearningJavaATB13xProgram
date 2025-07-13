package Task_9July;

public class trywithoutException {
    public static void main(String[] args) {

        int i=10;
        try{
            int result=i;
            System.out.println(result);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Finally block ");
        }
    }
}
