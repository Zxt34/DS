public class Test6_12 {
    public int findMaxGap(int[] A, int n) {
        int leftmax = 0,rightmax = 0,value = 0,temp = 0;
        for (int k = 0; k < n - 1; k++) {
            if(value != 0 && A[k] > leftmax){
                leftmax = A[k];
            }else{
                leftmax = A[0];
                for (int i = 0; i <= k; i++) {
                    leftmax = A[i] > leftmax ? A[i] : leftmax;
                }
            }
            rightmax = A[k + 1];
            for (int j = k + 1; j < n; j++) {
                rightmax = A[j] > rightmax ? A[j] : rightmax;
            }
            value = leftmax - rightmax;
            value = value < 0 ? -value : value;
            temp = value > temp ? value : temp;
        }
        return temp;
    }
}