package Task_7July;

//Multiple inheritance can be achieved by interfaces

public class DocumentInterface implements Printable, Showable {

    public void shows() {
      Showable.super.shows();
    }

    public void print() {
        Printable.super.print();
    }

    public static void main(String[] args) {
        DocumentInterface d=new DocumentInterface();
        d.print();
        d.shows();
    }
}



interface Printable{
  default void print()
    {
        System.out.println("Printing Document");
    }
}

interface Showable{

    default void shows()
    {
        System.out.println("Showing Document");
    }
}
