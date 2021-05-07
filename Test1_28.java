import java.util.Arrays;

public class Test1_28 {
//    public int evalRPN(String[] tokens) {
//
//    }

    public static int findUnsortedSubarray(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        Arrays.sort(nums);
        int start = 0, end = 0,i = 0;
        for (; i < nums.length; i++) {
            if(arr[i] != nums[i]) {
                start = i;
                break;
            }
        }
        if(i >= nums.length)
            return 0;
        for (i = nums.length - 1; i >= 0; i--) {
            if(arr[i] != nums[i]) {
                end = i;
                break;
            }
        }
        return (end - start + 1);
    }

    public static void main(String[] args) {
//        int[] nums = {2,6,4,8,10,9,15};
//        System.out.println(findUnsortedSubarray(nums));
    }
}
