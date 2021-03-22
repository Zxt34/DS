
    import java.util.Arrays;

    public class Test3_22 {
        public static void insertSort(int[] arr) {
            int bound = 1;
            // [0, bound) 是已排序区间.
            // [bound, length) 待排序区间.
            for (; bound < arr.length; bound++) {
                int v = arr[bound];
                int cur = bound - 1;
                for (; cur >= 0; cur--) {
                    if (arr[cur] > v) {
                        arr[cur + 1] = arr[cur];
                    } else {
                        break;
                    }
                }
                arr[cur + 1] = v;
            }
        }

        // 谢尔/希尔
        public static void shellSort(int[] arr) {
            // 指定 gap 序列, len/2, len/4, len/8,...,1
            int gap = arr.length / 2;
            while (gap >= 1) {
                _shellSort(arr, gap);
                gap = gap / 2;
            }
        }

        public static void _shellSort(int[] arr, int gap) {
            // 进行分组插排. 分组依据就是 gap.
            // gap 同时也表示分的组数.
            // 同组的相邻元素, 下标差值就是 gap
            // 下面的代码其实和插入排序是一样的. 尤其是把 gap 设为 1
            int bound = gap;
            for (; bound < arr.length; bound++) {
                int v = arr[bound];
                int cur = bound - gap;
                for (; cur >= 0; cur -= gap) {
                    if (arr[cur] > v) {
                        // 进行搬运
                        arr[cur + gap] = arr[cur];
                    } else {
                        break;
                    }
                }
                arr[cur + gap] = v;
            }
        }

        public static void selectSort(int[] arr) {
            // 创建一个变量 bound 表示已排序区间和待排序区间的边界.
            // [0, bound) 已排序区间
            // [bound, length) 待排序区间
            int bound = 0;
            for (; bound < arr.length; bound++) {
                // 里层循环要进行打擂台的过程.
                // 擂台的位置就是 bound 下标的位置
                for (int cur = bound + 1; cur < arr.length; cur++) {
                    if (arr[cur] < arr[bound]) {
                        // 如果发现挑战者比擂主小, 就交换两个元素
                        swap(arr, cur, bound);
                    }
                }
            }
        }

        public static void heapSort(int[] arr) {
            // 1. 先建立堆!!
            createHeap(arr);
            // 2. 需要循环的取出堆顶元素, 和最后一个元素交换并删除之
            //    再从 0 位置进行调整
            int heapSize = arr.length;
            for (int i = 0; i < arr.length; i++) {
                // 交换 0 号元素和堆的最后一个元素
                swap(arr, 0, heapSize - 1);
                // 把最后一个元素从堆上删除
                heapSize--;
                // 从 0 号位置开始往下进行调整
                shiftDown(arr, heapSize, 0);
            }
        }

        public static void createHeap(int[] arr) {
            for (int i = (arr.length - 1 - 1) / 2; i >= 0; i--) {
                shiftDown(arr, arr.length, i);
            }
        }

        public static void shiftDown(int[] arr, int size, int index) {
            int parent = index;
            int child = 2 * parent + 1;
            while (child < size) {
                // 先找出左右子树比较大的~
                if (child + 1 < size && arr[child + 1] > arr[child]) {
                    child = child + 1;
                }
                // 再去比较 child 和 parent
                if (arr[parent] < arr[child]) {
                    swap(arr, parent, child);
                } else {
                    break;
                }
                parent = child;
                child = 2 * parent + 1;
            }
        }

        public static void swap(int[] arr, int x, int y) {
            int tmp = arr[x];
            arr[x] = arr[y];
            arr[y] = tmp;
        }

        public static void main(String[] args) {
            int[] arr = {9, 5, 2, 7, 3, 6, 8};
            // insertSort(arr);
//        shellSort(arr);
//        selectSort(arr);
            heapSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }