import BMS.BookList;

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
        //......
        Scanner sc = new Scanner(System.in);
        int who = sc.nextInt();
        String name = sc.next();
        if(who == 1)
            return new Admin(name);
        return new NormalUser(name);
    }
}
