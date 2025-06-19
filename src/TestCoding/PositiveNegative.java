package TestCoding;

public class PositiveNegative {
    public static void main(String[] args) {
        int a=6;

        if(a>0)
            {
                System.out.println("Positive number " +a);
            }
            else if (a<0)
            {
                System.out.println("Negative number " +a);
            }else if(a==0)
            {
                System.out.println("number is zerp");
            }
            else {
                System.out.println("not a number");
            }
    }
}
