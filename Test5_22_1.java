import java.util.Scanner;

public class Test5_22_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            char[] strCh = str.toCharArray();
            for (int i = 0; i < strCh.length; i++) {
                if(strCh[i] == ' '){
                    continue;
                }else{
                    if('E' < strCh[i]){
                        strCh[i] = (char)(strCh[i] - 5);
                    }else{
                        strCh[i] = (char)(strCh[i] + 21);
                    }
                }
            }
            System.out.println(new String(strCh));
        }
    }
}