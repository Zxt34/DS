public class Test1_23 {
    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0, rightSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }
            for (int k = i+1; k < nums.length; k++) {
                rightSum += nums[k];
            }
            if(leftSum == rightSum)
                return i;
        }
        return -1;
    }
//        int n = nums.length;
//        int index = -1;
//        for(int i =0; i<n; i++) {
//            int sum1 = 0, sum2 = 0;
//            for(int j =0; j<i; j++)
//                sum1+=nums[j];
//            for(int k =i+1; k<n; k++)
//                sum2+=nums[k];
//            if(sum1 == sum2) {
//                index = i;
//                break;
//            }
//        }
//        return index;

//        int left = 0;
//        int right = nums.length-1;
//        int leftSum = 0,rightSum = 0;
//        if(nums.length != 0){
//        leftSum = nums[left];
//        rightSum = nums[right];
//        }
//        while((right - left)>= 2){
////            if(nums[left] >= 0 && nums[right] >= 0) {
//                if ((right - left) >= 2 && leftSum <= rightSum)
//                    leftSum += nums[++left];
//                if ((right - left) >= 2 && leftSum > rightSum)
//                    rightSum += nums[--right];
////            }
//            if((right - left)>= 2 && leftSum == rightSum)
//                break;
//        }
//        if((right - left)<= 1 || leftSum != rightSum)
//            return -1;
//        return left+1;
//    }

    public int[] sortArrayByParity(int[] A) {
        int left = 0;
        int right = A.length-1;
        while(left < right){
            while(left < right && A[left] % 2 == 0)
                left++;
            while(left < right && A[right] % 2 != 0)
                right--;
            if(left < right){
                int temp = A[left];
                A[left] = A[right];
                A[right] = temp;
                left++;
                right--;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        int[] arr = {-1,-1,-1,0,1,1};
        System.out.println(pivotIndex(arr));
    }
}