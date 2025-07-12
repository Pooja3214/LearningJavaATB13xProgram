package Task_4July;

public class Animal {
 protected void  eat()
    {
        System.out.println("Animal is eating");
    }

}

class Dog extends Animal{

    void doEat(){
        eat();
    }

    public static void main(String[] args) {
        Dog d=new Dog();
        d.doEat();
    }
}