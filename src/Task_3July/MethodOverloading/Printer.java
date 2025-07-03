package Task_3July.MethodOverloading;

public class Printer {

   void printData(String data)
    {
        System.out.println("String data printed: "+data);
    }

    void printData(int data)
    {
        System.out.println("int data printed: " +data);
    }

    void printData(float data)
    {
        System.out.println("Fload data printed: " +data);
    }

    public static void main(String[] args) {
        Printer p=new Printer();
        p.printData(4);
        p.printData(6.8f);
        p.printData("Pooja Sharma");
    }
}
