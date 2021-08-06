public class Test8_6 {
    public void merge(int A[], int m, int B[], int n) {
        if(m == 0){
            for (int i = 0; i < B.length; i++) {
                A[i] = B[i];
            }
            return;
        }
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(i >= 0 && j >= 0){
            if(A[i] > B[j]){
                A[k--] = A[i--];
            }else{
                A[k--] = B[j--];
            }
        }
        if(i == -1){
            while(j >= 0){
                A[k--] = B[j--];
            }
            return;
        }
        if(j == -1){
            while(i >= 0){
                A[k--] = A[i--];
            }
            return;
        }
    }
}