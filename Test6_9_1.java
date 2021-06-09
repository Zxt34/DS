import java.util.Scanner;

public class Test6_9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            boolean contain = true;
            StringBuffer stringBuffer = new StringBuffer(sc.next());
            char[] strCh = sc.next().toCharArray();
            for (char c : strCh) {
                if(stringBuffer.indexOf(String.valueOf(c)) != -1){
                    stringBuffer.deleteCharAt(stringBuffer.indexOf(String.valueOf(c)));
                }else{
                    System.out.println("No");
                    contain = false;
                    break;
                }
            }
            if(contain){
                System.out.println("Yes");
            }
        }
    }
}