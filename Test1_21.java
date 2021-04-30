public class Test1_21 {
    public static boolean isLongPressedName(String name, String typed) {
        if(name.length() == typed.length()){
            if(name.equals(typed))
                return true;
            else
                return false;
        }else if(name.length() > typed.length())
            return false;
        else{
            char[] nameCh = name.toCharArray();
            char[] typedCh = typed.toCharArray();
            int i = 0,j = 0,k = 0,t = 0;
            for (i = 0,k = 0;i < nameCh.length && k < typedCh.length;) {
                if(nameCh[i] != typedCh[k])
                    return false;
                else{
                    j = i;
                    t = k;
                    while(j < nameCh.length && nameCh[i] == nameCh[j])
                        j++;
                    while(t < typedCh.length && typedCh[k] == typedCh[t])
                        t++;
                    if((j - i) > (t - k))
                        return false;
                    else{
                        i = j;
                        k = t;
                    }
                }
            }
            return (i == nameCh.length && k == typedCh.length);
        }
    }

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {       //Arrays.sort(nums);
            for (int j = i + 1; j < nums.length; j++) {   //for (int i = 0; i < nums.length - 1; i++) {
                if(nums[i] == nums[j])                    //if (nums[i] == nums[i + 1]) {
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        if(isLongPressedName("alex","aaleex") == true)
            System.out.println("输入名字时有长按");
        else
            System.out.println("输入时无长按或输入有误");
//        String str = "hello";
//        if(str.contains("l"))
//            System.out.println("str含字符l");
//        int[] arr = {1,2,3,4,5,1};
//        int[] nums = {1,1,1,3,3,4,3,2,4,2};
//        if(containsDuplicate(arr) == true)
//            System.out.println("该数组中有重复元素");
//        else
//            System.out.println("该数组中没有重复元素");
//        if(containsDuplicate(nums) == true)
//            System.out.println("该数组中有重复元素");
//        else
//            System.out.println("该数组中没有重复元素");
    }
}

