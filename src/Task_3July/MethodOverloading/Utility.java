package Task_3July.MethodOverloading;

public class Utility {

    void max(int a, int b)
    {
        if(a>b)
        {
            System.out.println(a+ " is maximum no.");
        }else {
            System.out.println(b+ " is maximum no.");
        }
    }

    void max(int a, int b, int c)
    {
        if(a>b && a>c)
        {
            System.out.println(a+ " is max no.");
        }else if(b>a && b>c)
        {
            System.out.println(b+ " is max no.");
        }else{
            System.out.println(c+ " is max no.");
        }
    }

    void max(double a, double b)
    {
        if(a>b)
        {
            System.out.println(a+ " is maximum no.");
        }else {
            System.out.println(b+ " is maximum no.");
        }
    }
    public static void main(String[] args) {
Utility u=new Utility();
u.max(4,8);
u.max(6.5,1.2);
u.max(5,7,9);
    }
}
