package Task_11July;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayVsLinkedList {
    public static void main(String[] args) {
        ArrayList a=new ArrayList<>();

        long startArrayTime=System.currentTimeMillis();
        for(int i=0;i<99999;i++)
        {
            a.add(i);
        }

        long endArrayTime=System.currentTimeMillis();
        System.out.println(endArrayTime-startArrayTime);

        LinkedList l=new LinkedList();
        long startLinkedTime=System.currentTimeMillis();
        for(int i=0;i<99999;i++)
        {
            l.add(i);
        }
        long endLinkedTime=System.currentTimeMillis();
        System.out.println(endLinkedTime-startLinkedTime);

    }
}
