public class Test1_25 {
    public String addBinary(String a, String b) {
        int c = 0,aLength = a.length()-1,bLength = b.length()-1;
        char[] aCh = a.toCharArray();
        char[] bCh = b.toCharArray();
        StringBuffer sb = new StringBuffer();
        while(c > 0 || aLength >= 0 || bLength >= 0){
            int valA = aLength >= 0 ? aCh[aLength--] - '0' : 0;
            int valB = bLength >= 0 ? bCh[bLength--] - '0' : 0;
            int sum = valA + valB + c;
            c = sum / 2;
            sb.append(sum % 2);
        }
        return sb.reverse().toString();
    }

    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    res[0] = i;
                    res[1] = j;
                }
            }
        }
        return res;
    }
}

//    public static void main(String[] args) {
//        try{
//            System.out.println(divide(10,0));
//        }catch (ArithmeticException e){
//            e.printStackTrace();
//        }
//    }
//    public static int divide(int i, int i1) throws ArithmeticException{
//        if(i1 == 0)
//            throw new ArithmeticException("抛出除0异常");
//        return i/i1;
//    }
//}

//Main.java﻿
//package Exception;
//        import java.util.Scanner;
//public class Main {
//    private static String userName = "admin";
//    private static String userPassword = "123456";
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入用户名：");
//        String name = sc.next();
//        System.out.println("请输入密码：");
//        String password = sc.next();
//        try{
//            login(name,password);
//        }catch (NameException nameException){
//            nameException.printStackTrace();
//        }catch (PasswordException passwordException){
//            passwordException.printStackTrace();
//        }
//    }
//    public static void login(String name, String password) throws NameException, PasswordException {
//        if(!userName.equals(name))
//            throw new NameException("用户名输入有误");
//        if(!userPassword.equals(password))
//            throw new PasswordException("密码输入有误");
//        System.out.println("登陆成功");
//    }
//}
//NameException.java
//package Exception;
//public class NameException extends  Exception {
//    public NameException(String message) {
//        super(message);
//    }
//}
//PasswordException.java
//package Exception;
//public class PasswordException extends Exception {
//    public PasswordException(String message) {
//        super(message);
//    }
//}﻿