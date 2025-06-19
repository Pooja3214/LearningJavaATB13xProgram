package ex_09_SwitchCase;

public class Lab034_INTERVIEW {

    public static void main(String[] args) {

    //Q1: No output
       /* int a = 10;
        switch (a) {

        }*/

        //Q2: Match ASCII"  char A give integer value 65

       /* char ch = 'A';
        switch (ch){

            case 65:
                System.out.println("Match ASCII");
                break;
            default:
                System.out.println("No Match");


        }*/

        //Q3: only byte, int, short, long, wrapper, enum supported in switch
//                switch (true){
//
//        }

        //Q4: No output
        long a11 = 30l;
        switch ((int) a11) {
        }
    }
}
