import java.util.ArrayList;
import java.util.Arrays;

public class Test7_3 {
    public int jumpFloor(int target) {
        if(target == 1)
            return 1;
        if(target == 2)
            return 2;
        return jumpFloor(target - 1) + jumpFloor(target - 2);
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        if(k > input.length)
            return res;
        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            res.add(input[i]);
        }
        return res;
    }

//    public void merge(int A[], int m, int B[], int n) {
//        if(m == 0){
//            Arrays.sort(B);
//            for (int i = 0; i < n; i++) {
//                A[i] = B[i];
//            }
//            return;
//        }
//        for (int i = 0; i < B.length; i++) {
//            for (int j = 0; j < m; j++) {
//                if(B[i] >= A[j]){
//                    for (int k = m - 1; k >= j + 1; k--) {
//                        A[k + 1] = A[k];
//                    }
//                    A[j + 1] = B[i];
//                    m++;
//                }else{
//                    for (int k = m - 1; k >= j; k--) {
//                        A[k + 1] = A[k];
//                    }
//                    A[j] = B[i];
//                    m++;
//                }
//            }
//        }
//    }

    public void merge(int A[], int m, int B[], int n) {
        //System.arraycopy(nums2, 0, nums1, m, n);
        int j = 0;
        for (int i = m; i < A.length; i++) {
            A[i] = B[j++];
        }
        Arrays.sort(A);
    }
}
