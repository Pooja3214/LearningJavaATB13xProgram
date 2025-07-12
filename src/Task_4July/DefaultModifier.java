package Task_4July;

public class DefaultModifier {

    void display(){
        System.out.println("Default modifier access");
    }

    public static void main(String[] args) {
        DefaultModifier d=new DefaultModifier();
        d.display();
    }
}
// Default modifier access only within the package
class DefaultAccessCheck extends DefaultModifier{
    public static void main(String[] args) {
        DefaultAccessCheck d1=new DefaultAccessCheck();
        d1.display();
    }
}