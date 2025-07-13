package Task_11July;

import java.util.ArrayList;
import java.util.Iterator;

public class AddDisplayArrayListElements {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("Dipak");
        a.add("Ravi");
        a.add("Sneha");
        a.add("Priya");
        a.add("Anjali");


        // Using for Loop
//        for(int i=0;i< a.size();i++){
//            System.out.println(a.get(i));
//        }

      //Using Iterator for collections
        Iterator t=a.iterator();
        while(t.hasNext())
        {
            System.out.println(t.next());
        }
    }
}
