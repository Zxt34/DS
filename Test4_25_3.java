import java.util.ArrayList;
import java.util.Scanner;

public class Test4_25_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
            ArrayList as = Func(str);
            System.out.println(as.size());
            for (int i = 0; i < as.size(); i++) {
                System.out.println(as.get(i));
            }
        }
    }

    public static ArrayList<StringBuilder> Func(String s){
        ArrayList re = new ArrayList<>();
        char[] c = s.toCharArray();
        boolean flag = true;
        int i = 0;
        while(flag){
            if(c[i] == '"'){
                StringBuilder sd = new StringBuilder();
                i++;
                while(true){
                    sd.append(c[i]);
                    i++;
                    if(c[i] == '"'){
                        re.add(sd);
                        i++;
                        break;
                    }
                }
            }else {
                StringBuilder sdd = new StringBuilder();
                while(true){
                    if(c[i] == ' '){
                        i++;
                    }
                    sdd.append(c[i]);
                    i++;
                    if(i == c.length){
                        re.add(sdd);
                        flag = false;
                        break;
                    }
                    if(c[i] == ' '){
                        re.add(sdd);
                        i++;
                        break;
                    }
                }
            }
        }
        return re;
    }
}