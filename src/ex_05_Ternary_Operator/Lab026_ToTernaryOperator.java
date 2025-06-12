package ex_05_Ternary_Operator;

public class Lab026_ToTernaryOperator {
    public static void main(String[] args) {

        //Age to vote
        int age =19;
        String vote=age>18?"Yes,you can vote":"N0, you can't vote";

        System.out.println(vote);

        //Positive or negative number

        int num=-19;
        String res= num>0?"Positive":"Negative";

        System.out.println(num);


    }

}
