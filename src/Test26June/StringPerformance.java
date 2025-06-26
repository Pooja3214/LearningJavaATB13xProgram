package Test26June;
import java.time.Duration;

public class StringPerformance {
    public static void main(String[] args) {
//String performance
        long starttime = System.nanoTime();
        String s = "";
        for (int i = 0; i <= 1000; i++) {
            s = s + "sh";
        }
        long endtime = System.nanoTime();

        Duration elapsed = Duration.ofNanos(endtime - starttime);
        long milliseconds = elapsed.toMillis();
        System.out.println("string concatenation time :" + (milliseconds));

        //String Builder performance
         starttime = System.nanoTime();

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=1000;i++)
        {
            sb=sb.append("sh");
        }
        endtime = System.nanoTime();

         elapsed = Duration.ofNanos(endtime - starttime);
         milliseconds = elapsed.toMillis();
        System.out.println("string concatenation time :" + (milliseconds));

        //StringBuffer performance
        starttime = System.nanoTime();

        StringBuffer sbuffer = new StringBuffer();
        for(int i=0;i<=1000;i++)
        {
            sbuffer=sbuffer.append("sh");
        }

        endtime = System.nanoTime();

        elapsed = Duration.ofNanos(endtime - starttime);
        milliseconds = elapsed.toMillis();
        System.out.println("string concatenation time :" + (milliseconds));
    }
}
