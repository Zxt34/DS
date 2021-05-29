import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

public class Test1_31 {
    public static boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i];
        }
        if(sum % 3 != 0)
            return false;
//        List<List<Integer>> lists = new ArrayList<>();
//        lists.add(new ArrayList<>());
//        lists.add(new ArrayList<>());
        sum = sum / 3;
        int curSum = 0, flag = 0;
        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            if(curSum == sum){
                flag++;
                if(flag == 2){
                    return true;
                }
                curSum = 0;
            }
        }
        return false;
    }

//    public int getImportance(List<Employee> employees, int id) {
//        int imp = 0;
//        List<Integer> list = new ArrayList<>();
//        list.add(id);
//        while(list.size() > 0){
//            for (Employee e:employees) {
//                if(list.get(0) == e.id){
//                    imp += e.importance;
//                    list.addAll(subordinates);
//                    employees.remove(e);
//                    list.remove(0);
//                    break;
//                }
//            }
//        }
//        return imp;
//    }

//    List<String> s = new ArrayList<>();
//    s.add();
//    public ListNode Merge(ListNode list1,ListNode list2) {
//        ListNode list = new ListNode();
//        for(int i = 0; i < list1.size(); i++){
//            list.add(list1.get(i));
//        }
//        for(int i = 0; i < list2.size(); i++){
//            list.add(list2.get(i));
//        }
//        list.sort();
//        return list;
//    }

    public static char[] contain(String str) {
        StringBuffer sb = new StringBuffer(str);
        char[] strCh = str.toCharArray();
        for (int i = 0; i < strCh.length; i++) {
            int j = i + 1;
            for (; j < strCh.length; j++) {
                if (strCh[i] == strCh[j]) {
                    int index = sb.lastIndexOf(String.valueOf(strCh[i]));
                    sb.deleteCharAt(index);
                    break;
                }
            }
        }
        str = sb.toString();
        char[] res = str.toCharArray();
        return res;
    }

    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        while(sc.hasNext()) {
//            String str = sc.next();
//            System.out.println(contain(str));
//        }
        int[] arr = {1,-1,1,-1};
        System.out.println(canThreePartsEqualSum(arr));
    }
}