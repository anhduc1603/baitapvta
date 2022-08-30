import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ManagerUser {
    HashMap<Integer, User> userMap;

    public ManagerUser() {
        this.userMap = new LinkedHashMap<>();
    }

    public void showUser() {
        for (User user : userMap.values()) {
            System.out.println(user);
        }
    }

    public void addUser(int id, User user) {
        this.userMap.put(id, user);
    }

    public User userById(int id) {
        return this.userMap.get(id);
    }

    public void removeUserByid(int id) {
        this.userMap.remove(id);
    }

    public void login(Scanner sc){
        System.out.println("Nhập tài khoản: ");
        String email = sc.nextLine();
        if(isValid(email)==false){
            System.out.println("Nhập lại email, email sai định dạng");
        }
        System.out.println("Nhập mật khẩu: ");
        String password = sc.nextLine();
        if(isValidPassword(password)==false){
            System.out.println("Nhập lại password, password sai định dạng");
        }
        System.out.println("Đăng nhập thành công, email :  " + email + " password : "+ password);
    }

    public static boolean isValid(String email) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\." +
                "[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                "A-Z]{2,7}$";

        Pattern pat = Pattern.compile(emailRegex);
        if (email == null)
            return false;
        return pat.matcher(email).matches();
    }

    public static boolean isValidPassword(String password)
    {
        String regex = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static boolean isFullname(String str) {
        String expression = "^[a-zA-Z\\s]+";
        return str.matches(expression);
    }

    public void createAdmin(Scanner sc){
        System.out.println("Nhập email Admin: ");
        String email = sc.nextLine();
        if(isValid(email)==false){
            System.out.println("Nhập lại email, email sai định dạng");
        }
        System.out.println("Nhập FullName Admin: ");
        String fullName = sc.nextLine();
        if(isFullname(fullName)==false){
            System.out.println("Nhập lại fullName, fullName sai định dạng");
        }

        System.out.println("Tạo tài khoản thành công");

    }
}