import java.util.Arrays;

public class Test1_22 {
    public static String reverseOnlyLetters(String S) {
        char[] str = S.toCharArray();
        int left = 0;
        int right = str.length-1;
        while(left < right){
            while(left < right && (str[left] < 65 ||(str[left] < 97 && str[left] > 90)|| str[left] > 122))
                left++;
            while(left < right && (str[right] < 65 ||(str[right] < 97 && str[right] > 90)|| str[right] > 122))
                right--;
            if(left < right){
                char temp = str[left];
                str[left] = str[right];
                str[right] = temp;
                left++;
                right--;
            }
        }
        S = String.valueOf(str);
        return S;
    }

    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        String str = "ab-cd";
        System.out.println(reverseOnlyLetters(str));
    }
}
