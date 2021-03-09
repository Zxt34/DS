import java.util.Scanner;

public class solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = toLowerCase(str);
        System.out.println(res);
    }

    public static String toLowerCase(String str) {
        String rest;
        if (str == null) {
            return null;
        }else{
            char[] res = new char[str.length()];
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if(c>='A'&&c<='Z'){
                    res[i] = (char)(c + 32);
                }else{
                    res[i] = c;
                }
            }
            rest = myToString(res);
        }
        return rest;
    }

    public static String myToString(char[] res) {
        String rest = "";
        for (int i = 0; i < res.length; i++) {
            rest += res[i];
        }
        return rest;
    }
}
