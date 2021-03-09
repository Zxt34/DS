package BMS.Operation;

import BMS.BookList;

import java.util.Scanner;

public class BorrowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("请输入您想借阅的书名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if(name.equals(bookList.getBooks(i).getName()))
                break;
        }
        if(i >= bookList.getSize()) {
            System.out.println("未找到指定书籍，无法借阅！");
            return;
        }
        if(bookList.getBooks(i).isBorrowed()) {
            System.out.println("已经被借阅了！");
            return;
        }
        bookList.getBooks(i).setBorrowed(true);
        System.out.println("借阅成功！");
    }
}
