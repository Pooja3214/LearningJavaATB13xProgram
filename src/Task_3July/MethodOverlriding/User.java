package Task_3July.MethodOverlriding;

public class User {
void login()
{
    System.out.println("User login");
}
    public static void main(String[] args) {
User u=new User();
u.login();

AdminUser a=new AdminUser();
a.login();

RegularUser r=new RegularUser();
r.login();
    }
}

class AdminUser{
    void login(){
        System.out.println("Admin user login");
    }
}

class RegularUser{
    void login(){
        System.out.println("Regular User login");
    }
}