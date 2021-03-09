package BMS;

import BMS.Operation.IOperation;

abstract public class User {
    protected String name;
    protected IOperation[] operations;

    public User(String name){
        this.name = name;
    }

    public abstract int menu();

    public void doOperation(int choice,BookList bookList){
        this.operations[choice-1].work(bookList);
    }
}
