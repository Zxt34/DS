import java.util.Arrays;
import java.util.Scanner;

class solution {
    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        rotate(arr,k);
    }
}
