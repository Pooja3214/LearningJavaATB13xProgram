package ex_05_Ternary_Operator;

public class Lab027_NestedTernary {
    public static void main(String[] args) {

        // age = 23
        //  age < 18 ->  Minor
        //  18 < age > 65 ->  Adult
        // age > 65 -> Senior Citizen
        int age = 23;

        String res= (age<18)?"Minor": (age>18 && age <65)?"Adult":"Senior Citizen";

        System.out.println(res);

        //Max of 3 no.
        int n1 = 2;
        int n2 = 9;
        int n3 = -11;

        int max=  (n1 > n2 && n1 > n3) ? n1 :(n2>n3 && n2>n1)?n2:n3;
        System.out.println(max);

    }
}