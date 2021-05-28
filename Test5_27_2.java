import java.util.Scanner;

public class Test5_27_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            if(s1.contains("\"")){
                StringBuffer stringBuffer = new StringBuffer();
                int flag = 0;
                for (int i = 0; i < s1.length(); i++) {
                    if(s1.charAt(i) == '"'){
                        flag++;
                    }else if(flag % 2 == 0 && s1.charAt(i) == ','){
                        stringBuffer.append("#");
                    }else {
                        stringBuffer.append(s1.charAt(i));
                    }
                }
                s1 = stringBuffer.toString();
                String[] s1Ch = s1.split("#");
                int i = 0;
                for (; i < s1Ch.length; i++) {
                    if(s1Ch[i].equals(s2)){
                        System.out.println("Ignore");
                        break;
                    }
                }
                if(i == s1Ch.length){
                    System.out.println("Important!");
                }
            }else{
                String[] s1Ch = s1.split(",");
                int i = 0;
                for (; i < s1Ch.length; i++) {
                    if(s1Ch[i].equals(s2)){
                        System.out.println("Ignore");
                        break;
                    }
                }
                if(i == s1Ch.length){
                    System.out.println("Important!");
                }
            }
        }
    }
}