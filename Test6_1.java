import java.util.Scanner;

public class Test6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();
            if(s1.length() > s2.length()){
                String temp = s1;
                s1 = s2;
                s2 = temp;
            }
            StringBuffer stringBuffer = new StringBuffer(s1);
            for (int i = 0; i < stringBuffer.length(); i++) {
                for (int j = i + 1; j < stringBuffer.length(); j++) {
                    if(stringBuffer.charAt(i) == stringBuffer.charAt(j)){
                        stringBuffer.deleteCharAt(j);
                    }
                }
            }
            s1 = stringBuffer.toString();
            int count = 0;
            for (int i = 0; i < s1.length(); i++) {
                for (int j = 0; j < s2.length(); j++) {
                    if(s2.charAt(j) == s1.charAt(i)){
                        count++;
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
}