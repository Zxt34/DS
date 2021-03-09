package Exception;
import java.util.Scanner;

public class Main {
    private static String userName = "admin";
    private static String userPassword = "123456";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String name = sc.next();
        System.out.println("请输入密码：");
        String password = sc.next();
        try{
            login(name,password);
        }catch (NameException nameException){
            nameException.printStackTrace();
        }catch (PasswordException passwordException){
            passwordException.printStackTrace();
        }
    }

    public static void login(String name, String password) throws NameException, PasswordException {
        if(!userName.equals(name))
            throw new NameException("用户名输入有误");
        if(!userPassword.equals(password))
            throw new PasswordException("密码输入有误");
        System.out.println("登陆成功");
    }
}