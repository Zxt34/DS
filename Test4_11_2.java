import java.util.HashMap;
import java.util.Scanner;

public class Test4_11_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        HashMap<Integer,Character> map = new HashMap<>();
        int index = 0;
        for (int i = 0; i < s2.length(); i++) {
            map.put(index,s2.charAt(i));
            index++;
        }
        for (int i = 0; i < s1.length(); i++) {
            if(!map.containsValue(s1.charAt(i)))
                System.out.println(s1.charAt(i));
        }
    }
}