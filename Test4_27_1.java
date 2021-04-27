import java.util.Scanner;

public class Test4_27_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();
            if(year <= 0 || month <= 0 || month > 12 || day <= 0 || day > day(isRun(year),month))
                System.out.println(-1);
            int days = 0;
            for (int i = 1; i < month; i++) {
                days += day(isRun(year),i);
            }
            days += day;
            System.out.println(days);
        }
    }

    public static int day(boolean isRun,int month){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        }else if(month == 4 || month == 6 || month == 9 || month == 11){
            return 30;
        }else if(isRun && month == 2){
            return 29;
        }else if(!isRun && month == 2){
            return 28;
        }else{
            return 0;
        }
    }

    public static boolean isRun(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 ==0){
            return true;
        }
        return false;
    }
}