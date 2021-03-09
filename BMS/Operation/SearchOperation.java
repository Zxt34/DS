package BMS.Operation;

import BMS.BookList;

import java.util.Scanner;

public class SearchOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("查找书籍");
        System.out.println("请输入您要查找的书名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if((bookList.getBooks(i).getName()).contains(name))
                System.out.println(bookList.getBooks(i));
        }
    }
}
