package Task_3July.MethodOverlriding;

public class Vehicle {

    void start()
    {
        System.out.println("Start the vehicle!");
    }

    public static void main(String[] args) {
Vehicle v=new Vehicle();
v.start();

Bike b=new Bike();
b.start();

Car c=new Car();
c.start();
    }
}

class Bike extends Vehicle{

    @Override
    void start()
    {
        System.out.println("Kick start the bike");
    }
}

class Car extends Vehicle{

    @Override
    void start()
    {
        System.out.println("Turn the key to start the car");
    }
}