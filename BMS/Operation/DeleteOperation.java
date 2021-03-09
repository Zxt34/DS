package BMS.Operation;

import BMS.BookList;

import java.util.Scanner;

public class DeleteOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("删除书籍");
        System.out.println("请输入您要删除的书名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if(name.equals(bookList.getBooks(i).getName()))
                break;
        }
        if(i >= bookList.getSize()) {
            System.out.println("抱歉，未找到您要删除的书籍:" + name);
            return;
        }
        if(i == bookList.getSize() - 1){
            bookList.setSize(bookList.getSize() - 1);
            System.out.println("删除成功！");
            return;
        }
        bookList.setBooks(i,bookList.getBooks(bookList.getSize() - 1));
        bookList.setSize(bookList.getSize() - 1);
        System.out.println("删除成功！");
    }
}
