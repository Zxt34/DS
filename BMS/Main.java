package BMS;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        User user = login();
        while(true){
            int choice = user.menu();
            user.doOperation(choice,bookList);
        }
    }

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入您的姓名: ");
        String name = scanner.next();
        System.out.println("=========================");
        System.out.println("请选择您的角色：");
        System.out.println(" 1. 管理员");
        System.out.println(" 2. 普通用户");
        System.out.println("=========================");
        System.out.println("请输入您的选择：");
        int who = scanner.nextInt();
        if(who == 1)
            return new Admin(name);
        else
            return new NormalUser(name);
    }
}
