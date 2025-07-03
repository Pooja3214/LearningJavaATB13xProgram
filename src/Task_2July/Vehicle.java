package Task_2July;

public class Vehicle {

    void sound()
    {
        System.out.println("Vehicle is ready");
    }
}

class Bike extends Vehicle{

    void soundBike()
    {
        System.out.println("Bike is ready");
    }

    public static void main(String[] args) {
        Bike b=new Bike();
        b.sound();
        b.soundBike();
    }
}