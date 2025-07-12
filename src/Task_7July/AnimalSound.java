package Task_7July;

public class AnimalSound {

    public static void main(String[] args) {
        Dog d=new Dog();
        d.makeSound();

        Cat c=new Cat();
        c.makeSound();
    }
}

abstract class Animals{
    //abstract method not instantiated
    abstract  void makeSound();

}
//abstarct method can be defined in extended class
class Dog extends Animals{
    void makeSound()
    {
        System.out.println("Dog Barks");
    }

}

class Cat extends Animals{
    void makeSound()
    {
        System.out.println("Cat Meow");
    }

}