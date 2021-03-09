package BMS;

import java.util.Arrays;

public class Test1_26 {
    public static int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        if(nums == null || nums.length == 0){
            res[0] = res[1] = -1;
            return res;
        }
        int start = 0, end = 0, i = 0, flag = 0;
        for (; i < nums.length; i++) {
            if(nums[i] == target) {
                start = end = i;
                flag = 1;
                while (i < nums.length && nums[i] == target)
                        end = i++;
                break;
            }
        }
        if(i == nums.length && flag == 0){
            res[0] = res[1] = -1;
            return res;
        }
        res[0] = start;
        res[1] = end;
        return res;
    }

    public static int myAtoi(String s) {
        s = s.trim();
        if(s == null || s.length() == 0)
            return 0;
        char[] sCh = s.toCharArray();
        if(sCh[0] < 48 || sCh[0] > 57){
            if(sCh[0] != '-' && sCh[0] != '+'){
                return 0;
            }
        }
        int flag = 1;
        if(sCh[0] == '-')
            flag = -1;
        if(sCh[0] == '+')
            flag = 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < sCh.length; i++) {
            if((sCh[i] == '-' || sCh[i] == '+') && sCh.length > 1 && i==0)
                i++;
            if(sCh[i] >= 48 && sCh[i] <= 57)
                sb.append(sCh[i]);
            else
                break;
        }
        String res = sb.toString();
        if(res == null || res.length() == 0)
            return 0;
        char[] resultCh = res.toCharArray();
        long result = 0;
        for (char c:resultCh) {
            result = result * 10 + (c - '0');
            if(result * flag < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
            else if(result * flag > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
        }
        return (int)result*flag;
    }

    public static void main(String[] args) {
//        String s = "21474836460";
//        System.out.println(myAtoi(s));
        int[] nums = {1};
        System.out.println(Arrays.toString(searchRange(nums,1)));
    }
}
