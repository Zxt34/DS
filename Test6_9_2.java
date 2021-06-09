import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test6_9_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            String[] str = new String[n];
            int count = 0;
            for (int i = 0; i < n; i++) {
                str[i] = sc.next();
            }
            String key = sc.next();
            char[] keyCh = key.toCharArray();
            Arrays.sort(keyCh);
            int no = sc.nextInt();
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int flag = check(key,str[i],keyCh);
                count += flag;
                if(flag == 1){
                    list.add(str[i]);
                }
            }
            System.out.println(count);
            Collections.sort(list);
            if(count >= no){
                System.out.println(list.get(no - 1));
            }
        }
    }

    private static int check(String key, String s, char[] keyCh) {
        if(key.equals(s) || key.length() != s.length()){
            return 0;
        }
        char[] sCh = s.toCharArray();
        Arrays.sort(sCh);
        return Arrays.equals(keyCh,sCh) ? 1 : 0;
    }
}