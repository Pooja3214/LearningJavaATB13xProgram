package Test26June;

public class StringComparison {
    public static void main(String[] args) {
        String s1= "Hello";
        String s2= "hello";
        String s3= "Hello";

        System.out.println( "Hello".compareToIgnoreCase("HELLO"));

    //    == operator
        System.out.println(s1==s2);

        //    equals()
        System.out.println(s1.equals(s2));


        //    equalsIgnoreCase()
        System.out.println(s1.equalsIgnoreCase(s2));

        //    and compareTo() methods.

        System.out.println(s1.compareTo(s2));

        //    and compareToIgnoreCase() methods.
        System.out.println(s1.compareToIgnoreCase(s2));
    }
}
