package BMS.Operation;

import BMS.Book;
import BMS.BookList;

import java.util.Scanner;

public class AddOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("新增书籍");
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入书名：");
        String name = sc.next();
        System.out.println("请输入作者：");
        String author = sc.next();
        System.out.println("请输入价格：");
        double price = sc.nextDouble();
        System.out.println("请输入类型：");
        String type = sc.next();
        Book book = new Book(name,author,price,type);
        int size = bookList.getSize();
        bookList.setBooks(size,book);
        bookList.setSize(size+1);
        System.out.println("新增成功");
    }
}
