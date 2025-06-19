package ex_10_For_Loop;

public class Lab047_For_Loop_Break {

    public static void main(String[] args) {

        // After using break, exits from loop
        for(int i=1;i<=10;i++)
        {
            if(i==4)
            break;
            else {
                System.out.println(+i);
            }
        }
    }
}
