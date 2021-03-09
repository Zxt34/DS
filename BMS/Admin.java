package BMS;

import BMS.Operation.*;

import java.util.Scanner;

public class Admin extends User {
    public Admin(String name) {
        super(name);
        this.operations = new IOperation[]{
                new SearchOperation(),
                new AddOperation(),
                new DeleteOperation(),
                new ShowOperation(),
                new ExitOperation()
        };
    }

    @Override
    public int menu() {
        System.out.println("=========================");
        System.out.println("Hello! " + name + ", 欢迎使用图书管理系统");
        System.out.println(" 1. 查阅书籍信息");
        System.out.println(" 2. 新增书籍信息");
        System.out.println(" 3. 删除书籍信息");
        System.out.println(" 4. 打印书籍列表");
        System.out.println(" 5. 退出系统");
        System.out.println("=========================");
        System.out.println("请输入您的选择: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }
}
