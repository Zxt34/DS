import java.util.Stack;

public class QuickSort {
    public static void quickSort(int[] arr){
        _quickSort(arr,0,arr.length - 1);
    }

    public static void _quickSort(int[] arr,int left,int right){
        if(left >= right){
            return;
        }
        int index = partition(arr,left,right);
        _quickSort(arr,left,index - 1);
        _quickSort(arr,index + 1,right);
    }

    public static int partition(int[] arr,int left,int right){
        int v = arr[right];
        int l = left;
        int r = right;
        while(l < r){
            while(l < r && arr[l] < v){
                l++;
            }
            while(l < r && arr[r] > v){
                r--;
            }
            if(l < r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[right];
        arr[right] = temp;
        return l;
    }

    public static void quickSortByLoop(int[] arr){
        Stack<Integer> res = new Stack<>();
        res.push(0);
        res.push(arr.length - 1);
        while(!res.isEmpty()){
            int left = res.pop();
            int right = res.pop();
            if(left >= right){
                return;
            }
            int index = partition(arr,left,right);
            res.push(index + 1);
            res.push(right);
            res.push(left);
            res.push(index - 1);
        }
    }
}