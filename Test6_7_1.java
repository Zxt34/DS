import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Test6_7_1 {
    public static void main(String[] args) {
        String symbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String number = "222333444555666777788899991234567890";
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                String str = sc.next();
                str = str.replace("-","");
                String result = "";
                for (int j = 0; j < 7; j++) {
                    result += number.charAt(symbol.indexOf(str.charAt(j) + ""));
                }
                result = result.substring(0,3) + "-" + result.substring(3,7);
                if(!arrayList.contains(result)){
                    arrayList.add(result);
                }
            }
            Collections.sort(arrayList);
            for (int i = 0; i < arrayList.size(); i++) {
                System.out.println(arrayList.get(i));
            }
            System.out.println();
        }
    }
}