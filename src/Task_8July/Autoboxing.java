package Task_8July;

public class Autoboxing {

    public static void main(String[] args) {
        int i=50;

        //Autoboxing- converting primitive to wrapper
        Integer i1=i;

        //Unboxed
        int i2=i1;

         Character c= 'b';
      //Unboxing- converting the wrapper to primitive data type
         char c1=c;
        System.out.println("Primitive:"+i);
        System.out.println("Autoboxing Wrapper :"+i1);
        System.out.println("unboxed:"+i2);

        System.out.println("Unboxing: "+c1);
    }
}
