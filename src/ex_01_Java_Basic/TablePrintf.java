package ex_01_Java_Basic;

public class TablePrintf {

    public static void main(String[] args) {

        int n=9;

        for(int i=1;i<=10;i++)
        {
           int res=n*i;
            System.out.printf("%d x %d",n,i);
            System.out.println(" = " +res);
        }

    }
}
