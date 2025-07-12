package Task_7July;

public interface VehicleDefaultStatic {

    default void start()
    {
        System.out.println("Vehicle started");
    }

    static void fuelType()
    {
        System.out.println("Fuel type is Petrol");
    }
}

class Car implements VehicleDefaultStatic{
    public static void main(String[] args) {
        Car c=new Car();
        c.start();

        //No need to crete object top call static method
        VehicleDefaultStatic.fuelType();
    }
}
