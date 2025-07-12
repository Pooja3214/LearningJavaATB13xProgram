package Task_7July;

public class AbstractClassConstructor {

    void method()
    {
        System.out.println("Method from abstract class");
    }

    AbstractClassConstructor(){
        method();
        System.out.println("Abstract class constructor called");
    }

    public static void main(String[] args) {
        AbstractClassConstructor a=new AbstractClassConstructor();

    }
}
