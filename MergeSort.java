public class MergeSort {
    public static void mergeSort(int[] arr){
        _mergeSort(arr,0,arr.length);
    }

    public static void _mergeSort(int[] arr,int left,int right){
        if(right - left <= 1){
            return;
        }
        int mid = (left + right) / 2;
        _mergeSort(arr,left,mid);
        _mergeSort(arr,mid,right);
        merge(arr,left,mid,right);
    }

    public static void merge(int[] arr,int left,int mid,int right){
        if(left >= right){
            return;
        }
        int[] temp = new int[right - left];
        int tempIndex = 0;
        int cur1 = left;
        int cur2 = mid;
        while(cur1 < mid && cur2 < right){
            if(arr[cur1] <= arr[cur2]){
                temp[tempIndex] = arr[cur1];
                tempIndex++;
                cur1++;
            }else{
                temp[tempIndex] = arr[cur2];
                tempIndex++;
                cur2++;
            }
        }
        while(cur1 < mid){
            temp[tempIndex] = arr[cur1];
            tempIndex++;
            cur1++;
        }
        while(cur2 < right){
            temp[tempIndex] = arr[cur2];
            tempIndex++;
            cur2++;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[left + i] = temp[i];
        }
    }
}