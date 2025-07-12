package Task_7July;

public class InterestCalculation {

    public static void main(String[] args) {
SBI s=new SBI();
s.getInterestRate();

HDFC h=new HDFC();
h.getInterestRate();
    }
}

abstract class Bank{
    abstract void getInterestRate();
}

class SBI extends Bank{
    void getInterestRate(){
        System.out.println("SBI interest rate: 6.5%");
    }
}

class HDFC extends Bank{
    void getInterestRate(){
        System.out.println("HDFC interest rate: 7.0%");
    }
}