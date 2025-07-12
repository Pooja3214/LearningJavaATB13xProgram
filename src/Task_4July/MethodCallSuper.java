package Task_4July;

import com.sun.jdi.Method;

public class MethodCallSuper {

    void showDetails()
    {
        System.out.println("Parent class method");
    }

}

class Child extends MethodCallSuper {
    void showDetails(){
        System.out.println("Child class method");

        //super keyword used to call parent class method
        super.showDetails();
    }

    public static void main(String[] args) {
       Child c=new Child();
       c.showDetails();
    }
}