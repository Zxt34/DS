import java.util.Scanner;

public class Test4_15_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int count = 0;
        for (int i = 0; i <= str1.length(); i++) {
            StringBuffer stringBuffer = new StringBuffer(str1);
            stringBuffer.insert(i,str2);
            if(isHuiWen(stringBuffer.toString()))
                count++;
        }
        System.out.println(count);
    }

    public static boolean isHuiWen(String s){
        int i = 0;
        int j = s.length() - 1;
        while(i <= j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}