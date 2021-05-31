import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Test5_30_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            sc.nextLine();
            String[] strCh = new String[n];
            for (int i = 0; i < n; i++) {
                strCh[i] = sc.nextLine();
            }
            Arrays.sort(strCh);
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < n - 1; i++) {
                if(!strCh[i + 1].startsWith(strCh[i] + "/")){
                    list.add(strCh[i]);
                }
            }
            list.add(strCh[n - 1]);
            for (String str : list) {
                System.out.println("mkdir -p " + str);
            }
            System.out.println();
        }
    }
}