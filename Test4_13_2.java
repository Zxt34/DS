import java.util.Scanner;

public class Test4_13_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] strArr = str.split(" ");
        String ret = "";
        for (int i = strArr.length - 1; i >= 0; i--) {
            ret += strArr[i];
            if(i > 0){
                ret += " ";
            }
        }
        System.out.println(ret);
    }
}