package ex_07_UserInput;

public class Lab_UserInput_CLI {

    public static void main(String[] args) {
/*
        String age_string=args[0];
        System.out.println(age_string);

        int age= Integer.parseInt(age_string);
String vote= age>=18?"Vote yes":"No";
        System.out.println(vote);
*/

        System.out.println(args[0]); // java.lang.ArrayIndexOutOfBoundsException
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[10]); // java.lang.ArrayIndexOutOfBoundsException

    }
}
