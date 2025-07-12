package Task_7July;

public interface SpeedLimitInterfaceConstant {

    final int MAX_SPEED = 120;

}

class Cars implements SpeedLimitInterfaceConstant{

    void speedLimit(){
        System.out.println("Max SPeed is:" +MAX_SPEED);
    }

    public static void main(String[] args) {
        Cars cars=new Cars();

        cars.speedLimit();
    }
}