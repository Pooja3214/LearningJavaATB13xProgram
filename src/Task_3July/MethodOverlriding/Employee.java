package Task_3July.MethodOverlriding;

public class Employee {

   void role()
    {
        System.out.println("General Employee");
    }
    public static void main(String[] args) {
Employee e= new Employee();
e.role();

Manager m=new Manager();
m.role();

Clerk c=new Clerk();
c.role();

Tester t=new Tester();
t.role();
    }
}

class Manager{
void role(){
    System.out.println("Manager");
}
}

class Clerk{
    void role(){
        System.out.println("Clerk");
    }
}

class Tester{
    void role(){
        System.out.println("Tester");
    }
}
