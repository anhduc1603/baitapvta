import java.util.*;

public class Main {
    public static void main(String[] args) {
        ManagerUser managerUser = new ManagerUser();
        Scanner sc = new Scanner(System.in);
        User user = new User(1,"Mèo Con","meocon@gmail.com","anhduc123");
        User user1 = new User(2,"Cún Con","cuncon@gmail.com","anhduc123");
        User user2 = new User(3,"Lợn Con","loncon@gmail.com","anhduc123");
        User user3 = new User(4,"Gà Con","gacon@gmail.com","anhduc123");
        managerUser.addUser(1,user);
        managerUser.addUser(2,user1);
        managerUser.addUser(3,user2);
        managerUser.addUser(4,user3);

        //Get user by id
//        System.out.println(managerUser.userById(2));


        //Remove By ID
//        managerUser.removeUserByid(2);

        //Get All User
//        managerUser.showUser();

        //Login
//       managerUser.login(sc);

        //create accout admin
        managerUser.createAdmin(sc);

    }
}
