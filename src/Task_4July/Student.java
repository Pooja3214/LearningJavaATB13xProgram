package Task_4July;

public class Student {

    Student(int i) {
        System.out.println(i);
        System.out.println("Parent Class constructor");
    }

}

class TestDefault extends Student{
//super() keyword is used to casll parent class constructor
    TestDefault(int i) {
        super(8);
        System.out.println("Child class constructor");
    }


    public static void main(String[] args) {
        TestDefault s=new TestDefault(10);

    }

}