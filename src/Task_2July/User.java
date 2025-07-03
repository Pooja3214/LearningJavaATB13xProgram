package Task_2July;

public class User {
void login()
{
    System.out.println("UJser login");
}
}

class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("Admin user can login and access");
    }
}

class SuperUser extends AdminUser{
    void shutdownSystem(){
        System.out.println("Super user can shut down system");
    }

    public static void main(String[] args) {
        SuperUser s=new SuperUser();
        s.login();
        s.accessAdminPanel();
        s.shutdownSystem();
    }
}
