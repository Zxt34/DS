import java.util.ArrayList;
import java.util.List;

public class Test1_19 {
    public  static boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        char[] arr = str.toCharArray();
        int count = 0;
        int left = 0;
        int right = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[left] == arr[right]) {
                left++;
                right--;
                count++;
            }
        }
        return (count == arr.length);
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        StringBuffer sb = new StringBuffer(magazine);
        int index = 0;
        for (char c :
                ransomNote.toCharArray()) {
            index = sb.indexOf(String.valueOf(c));
            if(index >= 0)
                sb.deleteCharAt(index);
            else
                return false;
        }
            return true;
    }

    public static void main(String[] args) {
//        String ransom = "abc";
//        String magazine = "adbce";
//        boolean result = canConstruct(ransom,magazine);
//        if(result == true)
//            System.out.println("是由 magazines 里面的字符构成的");
//        else
//            System.out.println("不是由 magazines 里面的字符构成的");
//        int x = 10;
//        if(isPalindrome(x) == true)
//            System.out.println(x + "是回文数");
//        else
//            System.out.println(x + "不是回文数");
//        int a = 121;
//        if(isPalindrome(a) == true)
//            System.out.println(a + "是回文数");
//        else
//            System.out.println(a + "不是回文数");
//            myCompareTo(str1,str2);
//            myContains(str1,str2);
//            String str1 = "efcdef";
//            String str2 = "ab";
//            System.out.println(myReplace(str1,"ef",str2));
        String str = "ab cd ef";
        System.out.println(mySplit(str," "));
    }

    public static List<String> mySplit(String str,String sign) {
        List<String> result = new ArrayList<>();
        char[] arrCh = str.toCharArray();
        char[] signCh = sign.toCharArray();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arrCh.length; ) {
            if (!isContains(arrCh, signCh,i)) {
                sb.append(arrCh[i]);
                i++;
            } else {
                result.add(sb.toString());
                sb = new StringBuffer();
                i += signCh.length;
            }
        }
        if (sb.length() != 0)
            result.add(sb.toString());
        return result;
    }

    public static boolean isContains(char[] arrCh, char[] signCh,int temp) {
        for (int i = 0; i < signCh.length; i++) {
            if(temp + i >= arrCh.length)
                return false;
            if(arrCh[i + temp]!=signCh[i])
                return false;
        }
        return true;
    }

    public static String myReplace(String str,String src,String des) {
        char[] arr = str.toCharArray();
        char[] desArr = des.toCharArray();
        int result = str.indexOf(src);
        for (int i = 0; i < desArr.length; i++) {
            arr[result] = desArr[i];
            result++;
        }
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            res += arr[i];
        }
        return res;
    }

    public static int myIndexOf(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        int length1 = str1.length();
        int length2 = str2.length();
        if(str1 == null||str1 == ""||str2 == null||str2 == ""||length2 > length1)
            return -1;
        for (int i = 0; i < length1; i++) {
            if(arr1[i] == arr2[0]&&i + str2.length() < str1.length()){
                int count = 0;
                for (int j = 0; j < length2; j++) {
                    if(arr1[i+j] == arr2[j])
                        count++;
                }
                if(count == length2)
                    return i;
            }
        }
        return -1;
    }

    public static void myContains(String str1, String str2) {
        if(str1.indexOf(str2) >= 0)
            System.out.println("str2是str1的子串");
        else
            System.out.println("str2不是str1的子串");
    }

    public static void myCompareTo(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        int length1 = str1.length();
        int length2 = str2.length();
        int min = length1 >= length2?length2:length1;
        for (int i = 0; i < min; i++) {
            if(arr1[i] > arr2[i])
                System.out.println("str1大");
            else if(arr1[i] < arr2[i])
                System.out.println("str2大");
            else {
                if(i == length1-1&&i == length2-1)
                    System.out.println("两个字符串一样大");
                else if(i == length1-1&&i < length2)
                    System.out.println("str2大");
                else {
                    if(i == length2-1&&i < length1)
                    System.out.println("str1大");
                }
            }
        }
    }
}