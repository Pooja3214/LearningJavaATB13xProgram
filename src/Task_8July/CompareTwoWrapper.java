package Task_8July;

public class CompareTwoWrapper {
    public static void main(String[] args) {

        // // Values between -128 and 127 are cached in Integer pool
        Integer a=30;
        Integer b=30;

        // // Values outside -128 and 127 are not cached
        Integer c=200;
        Integer d=200;

        //Compare objects using ==
        System.out.println("a==b: "+ (a == b));
        System.out.println("c==d: "+ (c == d));

        //Compare objects using equals
        System.out.println("a.equals(b): "+a.equals(b));
        System.out.println("c.equals(d): "+c.equals(d));
    }
}
