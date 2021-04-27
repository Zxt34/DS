import java.util.Scanner;

public class Test4_27_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            StringBuffer stringBuffer = new StringBuffer();
            int len = 0;
            int quotaNum = 0;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == '"'){
                    quotaNum++;
                    continue;
                }
                if(str.charAt(i) != ' '){
                    stringBuffer.append(str.charAt(i));
                }else if (quotaNum % 2 == 0){
                    stringBuffer.append('\n');
                    len++;
                }else {
                    stringBuffer.append(' ');
                }
            }
            System.out.println(len + 1);
            System.out.println(stringBuffer.toString());
        }
    }
}