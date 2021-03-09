package BMS.Operation;

import BMS.BookList;

public class ShowOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示书籍列表");
        for (int i = 0; i < bookList.getSize(); i++) {
            System.out.println(bookList.getBooks(i));
        }
    }
}
