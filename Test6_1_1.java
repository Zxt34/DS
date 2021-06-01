import java.util.Scanner;

public class Test6_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();
            int len1 = sc.nextInt();
            int len2 = sc.nextInt();
            System.out.println(process(s1,s2,len1,len2));
        }
    }

    private static int process(String str1, String str2, int len1, int len2) {
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        long res = 0;
        for (int i = len1; i <= len2; i++) {
            char a = ch1[0];
            char b = ch2[0];
            res += (long) Math.pow(26, i - 1) * (b - a);
            long suma = 0;
            long sumb = 0;
            for (int j = 1; j < ch1.length; j++)
            {
                suma = suma + (ch1[j] - 'a') * (long) Math.pow(26, i - 1 - j);
            }
            for (int j = 1; j < ch2.length; j++)
            {
                sumb = sumb + (ch2[j] - 'a') * (long) Math.pow(26, i - 1 - j);
            }
            res = res + sumb - suma;
        }
        res--;
        res= res % 1000007;
        return (int) res;
    }
}