package Task_4July;

public class PrivateAccess {

  private  void show()
    {
        System.out.println("Private access");
    }

    public static void main(String[] args) {
      PrivateAccess p=new PrivateAccess();
        p.show();
    }

}

class AccessCheck extends PrivateAccess{

    public static void main(String[] args) {
       AccessCheck a=new AccessCheck();

       //Show method is private access that is not access outside the class
//        a.show() ;
    }
}
