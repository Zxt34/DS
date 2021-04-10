public class Test4_10_4 {
    public int search (int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else{
                int i = mid;
                for(;i >= 0; i--){
                    if(nums[i] != target){
                        break;
                    }
                }
                return i + 1;
            }
        }
        return -1;
    }
}