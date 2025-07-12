package Task_7July;

public class AbstarctVsConcrete extends Parent{
void show()
{
    System.out.println("Abstract method implemented in extended class");
}
    public static void main(String[] args) {
AbstarctVsConcrete c= new AbstarctVsConcrete();
c.show();
c.display();
    }
}

abstract class Parent{

    abstract void show();

    void display()
    {
        System.out.println("Crete method inside abstract class");
    }
}
