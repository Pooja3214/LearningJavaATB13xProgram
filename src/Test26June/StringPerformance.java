package Test26June;

public class StringPerformance {
    public static void main(String[] args) {
//String performance
        long starttime = System.nanoTime();
        String s = "";
        for (int i = 0; i <= 1000; i++) {
            s = s + "sh";
        }
        long endtime = System.nanoTime();
        System.out.println("string concatenation time :" + (endtime - starttime));

        //String Builder performance
         starttime = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=1000;i++)
        {
            sb=sb.append("sh");
        }
        endtime = System.nanoTime();

        System.out.println("string builder time :" +(endtime-starttime));

        //StringBuffer performance
        starttime = System.nanoTime();
        StringBuffer sbuffer = new StringBuffer();
        for(int i=0;i<=1000;i++)
        {
            sbuffer=sbuffer.append("sh");
        }

        endtime = System.nanoTime();
        System.out.println("string buffer time :" +(endtime-starttime));
    }
}
