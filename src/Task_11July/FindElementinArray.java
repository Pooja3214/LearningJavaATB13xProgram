package Task_11July;

import java.util.ArrayList;

public class FindElementinArray {
    public static void main(String[] args) {
        ArrayList a=new ArrayList();
        a.add("Mumbai");
        a.add("Delhi");
        a.add("Pune");

        if(a.contains("Pune")){
            System.out.println("Pune is in the list.");
        }else{
            System.out.println("Not available in list");
        }
    }
}
