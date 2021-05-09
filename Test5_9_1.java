import java.util.Scanner;

public class Test5_9_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();
            if(str1.length() < str2.length()){
                String temp = str2;
                str2 = str1;
                str1 = temp;
            }
            String subStr = "";
            int max = 0;
            for (int start = 0; start < str2.length(); start++) {
                for (int end = start; end < str2.length(); end++) {
                    if(str1.contains(str2.substring(start,end + 1))){
                        if(str2.substring(start,end + 1).length() > max){
                            subStr = str2.substring(start,end + 1);
                            max = str2.substring(start,end + 1).length();
                        }
                    }
                }
            }
            System.out.println(subStr);
        }
    }
}