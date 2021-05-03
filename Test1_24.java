import java.util.Arrays;

public class Test1_24 {
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int count = 2;
        int thirdMax = nums[nums.length-1];
        for (int i = nums.length-1; i >= 0; i--) {
            if (count == 0)
                break;
            if (thirdMax > nums[i]) {
                thirdMax = nums[i];
                count--;
            }
        }
            if(count == 0)
                return thirdMax;
            else
                return nums[nums.length-1];
    }

//        if(nums.length == 1 ||nums.length == 2)
//            return nums[nums.length-1];
//        for (int i = 0; i < nums.length - 1; i++) {
//            if (nums[i] == nums[i + 1])
//                nums[i] = 0;
//        }
//        Arrays.sort(nums);
//        return nums[nums.length-3];

//        String str = "";
//        for (int i = 0; i < nums.length; i++) {
//            str += nums[i];
//        }
//        StringBuffer sb = new StringBuffer();
//        for(char c:str.toCharArray()){
//            if(sb.indexOf(String.valueOf(c)) >= 0)
//                sb.append(String.valueOf(c));
//        }
//        str = sb.toString();
//        int[] arr = new int[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            arr[i] = Integer.parseInt(str.substring(i,i+1));
//        }
//        if(arr.length < 3 && arr.length > 0)
//            return arr[arr.length-1];
//        else if(arr.length >= 3)
//            return arr[arr.length-3];
//        else
//            return -1;
//    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >= 0; i--) {
            if(digits[i] == 9)
                digits[i] = 0;
            else{
                digits[i]++;
                return digits;
            }
        }
        int[] res = new int[digits.length+1];
        res[0] = 1;
        return res;
//        String str = "";
//        for (int i = 0; i < digits.length; i++) {
//            str += digits[i];
//        }
//        long num = (Long.valueOf(str).longValue())+1;
//        int res = (int)num;
//        str = String.valueOf(res);
//        int[] arr = new int[str.length()];
//        for (int i = 0; i < str.length(); i++) {
//            arr[i] = Integer.parseInt(str.substring(i,i+1));
//        }
//        return arr;
    }

    public static void main(String[] args) {
//        int[] nums = {9,9,9};
//        System.out.println(plusOne(nums));
        int[] arr = {3,2,1};
        System.out.println(thirdMax(arr));
//            try {
//                // do something that may cause an Exception
//            } catch (java.io.FileNotFoundException ex) {
//                System.out.print("FileNotFoundException!");
//            } catch (java.io.IOException ex) {
//                System.out.print("IOException!");
//            } catch (java.lang.Exception ex) {
//                System.out.print("Exception!");
//            }

//        String str = "Hello world  ,   ";
//        String[] strCh = str.split(" ");
//        for(String s:strCh)
//            System.out.println(s);
//        System.out.println(strCh.length);
//        String res = "";
//        for (int i = 0; i < strCh.length; i++) {
//            res += strCh[i];
//        }
//        System.out.println(res);
    }
}
