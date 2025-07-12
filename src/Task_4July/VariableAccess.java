package Task_4July;

public class VariableAccess {

    int a=3;

}

class child extends VariableAccess{
   int a=8;
    void show()
    {
        System.out.println("Parent Variable- "+super.a);
        System.out.println("Child variable -" +this.a);
    }

    public static void main(String[] args) {
        child c=new child();
        c.show();
    }
}