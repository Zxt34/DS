import java.util.Arrays;

public class Test1_18 {
//    public static void main(String[] args) {
//        int[] arr1 = {1,2,3,4,5};
//        int[] arr2 = {6,7,8,9,10};
//        exchange(arr1,arr2);
//    }
//    public int aMethod(){
//        static int i = 0;
//        i++;
//        return i;
//    }

    public static void exchange(int[] arr1, int[] arr2) {
        int temp = 0;
        for (int i = 0; i < arr1.length; i++) {
            temp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] = temp;
        }
        System.out.println("交换后：");
        System.out.println("arr1:" + Arrays.toString(arr1));
        System.out.println("arr2:" + Arrays.toString(arr2));
    }

//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,7};
//        System.out.println(sort(arr));
//    }
//
//    public static String sort(int[] arr) {
//        int left = 0;
//        int right = arr.length-1;
//        while(left < right){
//            while(left < right && arr[left]%2 == 0)
//                left++;
//            while(left < right && arr[right]%2 != 0)
//                right--;
//            if(left < right)
//            {
//                int temp = arr[right];
//                arr[right] = arr[left];
//                arr[left] = temp;
//            }
//        }
//        String res = Arrays.toString(arr);
//        return res;
//    }
//}
//        public String toString() {
//            System.out.print("aaa");
//            return "bbb";
//        }
//    public static void main(String[] args) {
//        System.out.println(new Test1_18());
//    }
//}
//    public static void main(String[] args){
//        String s;
//        System.out.println("s="+s);
//    public int aMethod(){
//        static int i = 0;
//        i++;
//        return i;
//}
//    public static void main(String args[]){
//        Test1_18 test = new Test1_18();
//        test.aMethod();
//        int j = test.aMethod();
//        System.out.println(j);
//    }
//    static boolean Paddy;
//    public static void main(String args[]){
//        System.out.println(Paddy);
//    }
//}
//    package NowCoder;
//        public static void hello() {
//            System.out.println("hello");
//        }
//    }
//    public class MyApplication {
//        public static void main(String[] args) {
//            // TODO Auto-generated method stub
//            Test1_18 test = null;
//            test.hello();
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,3,3,4,5};
//        System.out.println(removeElement(arr,3));
//        int[] arr = {1,2,3,4,6};
//        System.out.println(searchInsert(arr,5));
//        System.out.println(searchInsert(arr,3));
//        System.out.println(searchInsert(arr,7));
//    }
//    public static int searchInsert(int[] nums, int target) {
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i] == target)
//                return i;
//            else if(target > nums[0]&&target < nums[nums.length-1]){
//                if(target > nums[i]&&target < nums[i+1])
//                    return (i+1);
//            }else{
//                if(target > nums[nums.length-1])
//                    return nums.length;
//            }
//        }
//        return 0;
//    }
//    public static int removeElement(int[] nums, int val) {
//        if (nums == null || nums.length == 0)
//            return 0;
//        int length = 0;
//        int j = 0;
//        for(int i = 0; i < nums.length; i++)
//        {
//            if(nums[i]!=val)
//            {
//                nums[length++] = nums[i];
//            }
//        }
//        return length;
//    }
}
