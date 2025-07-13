package Task_11July;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();
        l.add("10");
        l.add("20");
        l.add("30");
        l.add("40");

        System.out.println("Original list: "+l);

        System.out.println("Reversed list:" + l.reversed());

    }
}
