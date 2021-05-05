public class Test1_27 {
    public static int compress(char[] chars) {
        int i = 0, j, num = 0;
        while(i < chars.length) {
            chars[num] = chars[i];
            num++;
            j = i + 1;
            while(j < chars.length && chars[i] == chars[j])
                j++;
            if(j - i > 1){
                for (char c : String.valueOf(j - i).toCharArray()) {
                    chars[num] = c;
                    num++;
                }
            }
            i = j;
        }
        return num;
    }

    public static boolean isPalindrome(String s) {
        char[] sCh = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if((sCh[i] >=48 && sCh[i] <= 57) || (sCh[i] >=65 && sCh[i] <= 90) || (sCh[i] >= 97 && sCh[i] <= 122))
                sb.append(sCh[i]);
        }
        s = sb.toString();
        String ss = sb.reverse().toString();
        if(s.equalsIgnoreCase(ss))
            return true;
        return false;
    }

    public static void main(String[] args) {
//        String str = "A man, a plan, a canal: Panama";
//        System.out.println(isPalindrome(str));
        char[] chars = {'a','a','b','b','b','c','c'};
        System.out.println(compress(chars));
    }
}
