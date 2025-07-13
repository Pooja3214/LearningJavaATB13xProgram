package Task_11July;

import java.util.ArrayList;

public class RemoveArrayList {
    public static void main(String[] args) {
        ArrayList l=new ArrayList();
        l.add("Amit");
        l.add("Neha");
        l.add("Suresh");

        //Before removing object
        System.out.println("Before removing object:");
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }

        l.remove(1);

        //After removing object
        System.out.println("After removing object:");
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
