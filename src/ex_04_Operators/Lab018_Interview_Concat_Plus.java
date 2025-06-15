package ex_04_Operators;

public class Lab018_Interview_Concat_Plus {

    public static void main(String[] args) {
        // concatination
        System.out.println("Pooja" + "Sharma"); //PoojaSharma
//        System.out.println("Pooja" / "Sharma";
//        System.out.println("Pooja" * "Sharma");
//        System.out.println("Pooja" - "Sharma");

        int a = 10;
        int b = 20;
        System.out.println(a + b); //30

        // + -> behave differently with the data type.
        // + -> operator overloading

        String first_name= "Pooja";
        String last_name="Sharma";

        System.out.println(first_name + last_name + a + b); // PoojaSharma1020 first is concat that's y it will concat at end
        System.out.println(a + b + first_name + last_name);//30PoojaSharma

        System.out.println(first_name + last_name + (a + b)); //PoojaSharma30

        // BODMAS - Bracket of Div, mul, add, sub

    }
}
