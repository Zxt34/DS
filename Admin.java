import BMS.Operation.AddOperation;
import BMS.Operation.IOperation;

import java.util.Scanner;

public class Admin extends User {
    public Admin(String name){
        this.name = name;
        this.operations = new IOperation[]{
                new AddOperation(),
                //......
        };
    }

    @Override
    public int menu() {
        //......
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        return choice;
    }
}
