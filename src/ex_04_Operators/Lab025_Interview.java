package ex_04_Operators;

public class Lab025_Interview {
    public static void main(String[] args) {
        int a = 10;
        boolean b = (10 == 11); // == -> Comparison 2 values
        System.out.println(a); //10
        System.out.println(b); // false

        long l = 10l; // 8 Byte, 64 Bits
        String s = "name"; //  8 Byte, 64 Bits

        char a1 = 'A'; // ASCII - 65
        char b1 = 'B'; // 66
        System.out.println(a1+b1); // 131
        System.out.println(a1); //A

        System.out.println('A' == 65);  //true

        short s1 = 10;
        char c = 'A';
        String s2 = "A";
        System.out.println(c+s1); // 75
        System.out.println(c);// A
        System.out.println(c+c); // 130
        System.out.println(c+s2);// AA
    }
}
