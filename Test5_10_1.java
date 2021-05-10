import java.util.Scanner;

public class Test5_10_1 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()){
//            String str = sc.nextLine();
//            StringBuffer stringBuffer = new StringBuffer(str);
//            System.out.println(stringBuffer.reverse().toString());
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            if(str1.length() > str2.length()){
                String temp = str1;
                str1 = str2;
                str2 = temp;
            }
            int max = 0;
            for (int start = 0; start < str1.length(); start++) {
                for (int end = start; end < str1.length(); end++) {
                    if(str2.contains(str1.substring(start,end + 1))){
                        if(str1.substring(start,end + 1).length() > max){
                            max = str1.substring(start,end + 1).length();
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }
}