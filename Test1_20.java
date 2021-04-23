import java.util.Arrays;

public class Test1_20 {
//    public Test1_20(String s){
//        System.out.print("B");
//    }
//public class Derived extends Test1_20{
//    public Derived (String s) {
//        super(s);
//        System.out.print("D");
//    }
//
//    public static void main(String[] args){
//        new Derived("C");
//    }
//}
    public static int lengthOfLastWord(String s) {
        String[] str = s.split(" ");
        for (int i = str.length-1; i >= 0; i--) {
            if(str[i].length() > 0)
                return str[i].length();
        }
        return 0;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[m+i] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void main(String[] args) {
        String str = "  Hello World   ";
        System.out.println(lengthOfLastWord(str));
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1,3,nums2,3);
        for (int i = 0; i < nums1.length; i++) {
            System.out.println(nums1[i]);
        }
    }
}
