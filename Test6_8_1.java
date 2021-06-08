import java.util.Scanner;

public class Test6_8_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.next();
            String[] strCh = str.split("_");
            String res = strCh[0];
            for (int i = 1; i < strCh.length; i++) {
                res += (char)(strCh[i].charAt(0) - 'a' + 'A');
                for (int j = 1; j < strCh[i].length(); j++) {
                    res += strCh[i].charAt(j);
                }
            }
            System.out.println(res);
        }
    }
}