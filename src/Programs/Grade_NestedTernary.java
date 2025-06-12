package Programs;

public class Grade_NestedTernary {
    public static void main(String[] args) {
        int num= 76;

     String res= (num>=90&&num<100)?"A+":(num>=75 && num<90)?"A":
(num>=60 && num<75)?"B":(num>=40)?"C":"Fail";

        System.out.println("Your grade is "+ res);

    }}
