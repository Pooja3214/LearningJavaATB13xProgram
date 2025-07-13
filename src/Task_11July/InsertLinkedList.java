package Task_11July;

import java.util.LinkedList;

public class InsertLinkedList {
    public static void main(String[] args) {
        LinkedList l=new LinkedList();

        l.add("Apple");
        l.add("Banana");
        l.add("Mango");

        System.out.println("Original list: "+l);

        l.add(1,"Orange");
        System.out.println("New List: "+l);
    }
}
