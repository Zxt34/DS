package BMS.Operation;

import BMS.BookList;

import java.util.Scanner;

public class ReturnOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("归还书籍");
        System.out.println("请输入您要归还书籍的名称：");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int i = 0;
        for (; i < bookList.getSize(); i++) {
            if(name.equals(bookList.getBooks(i).getName()))
                break;
        }
        if(i >= bookList.getSize()) {
            System.out.println("书籍未找到，无法归还！");
            return;
        }
        if(!bookList.getBooks(i).isBorrowed()){
            System.out.println("未借阅，无需归还！");
            return;
        }
        bookList.getBooks(i).setBorrowed(false);
        System.out.println("归还成功！");
    }
}
