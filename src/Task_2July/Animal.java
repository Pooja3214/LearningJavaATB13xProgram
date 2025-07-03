package Task_2July;

public class Animal {

    void makeSound()
    {
        System.out.println("Animal sound");
    }
}

class Cat extends Animal{
    void meow()
    {
        System.out.println("Meow");
    }

    public static void main(String[] args) {
        Cat c=new Cat();
        c.meow();

        Animal a=new Animal();
        a.makeSound();
    }
}