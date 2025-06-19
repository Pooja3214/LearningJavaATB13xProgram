package ex_09_SwitchCase;

public class Lab037_MultipleCaseJDK13 {
    public static void main(String[] args) {

        // Multiple case values allosed above JDK13

        int number=1;
        switch(number)
        {
            case 1,3,5,7:
                System.out.println("odd numbers");
                break;

            case 2,4,6,8:
                System.out.println("even numbers");
                break;
            default:
                System.out.println("invalid no.");
        }
    }
}
