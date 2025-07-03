package Task_3July.MethodOverlriding;

public class Animal {

    void sound()
    {
        System.out.println("Animal sound");
    }
    public static void main(String[] args) {
Animal a=new Animal();
a.sound();

Dog d= new Dog();
d.sound();

Cat c=new Cat();
c.sound();

Cow co=new Cow();
co.sound();
    }
}

class Dog{

    void sound(){
        System.out.println("Bark!");
    }
}

class Cat{
    void sound(){
        System.out.println("Meow");
    }
}

class Cow{
    void sound(){
        System.out.println("Moo");
    }
}