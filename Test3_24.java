import java.util.Arrays;
import java.util.Stack;

public class Test3_24 {
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

        public static void bubbleSort(int[] arr) {
            // bound 用来区分两个区间
            for (int bound = 0; bound < arr.length; bound++) {
                for (int cur = arr.length - 1; cur > bound; cur--) {
                    if (arr[cur - 1] > arr[cur]) {
                        swap(arr, cur - 1, cur);
                    }
                }
            }
        }

        public static void quickSort(int[] arr) {
            // 创建一个辅助递归的方法.
            // 在这个方法的参数中, 明确指定针对哪个区间进行递归.
            // [0, length - 1]
            _quickSort(arr, 0, arr.length - 1);
        }

        public static void _quickSort(int[] arr, int left, int right) {
            if (left >= right) {
                // 如果当前的区间为空, 或者只有一个元素
                // 都不需要进行任何处理
                return;
            }
            // 现针对当前 [left, right] 区间进行 partition 操作
            // 方法的返回值, 表示整理完当前区间后, 基准值所在的位置.
            // 遍历过程中的 left 和 right 的重合位置
            int index = partition(arr, left, right);
            // 递归的对左侧区间进行快速排序
            _quickSort(arr, left, index - 1);
            // 递归的对右侧区间进行快速排序
            _quickSort(arr, index + 1, right);
        }

        public static void quickSortByLoop(int[] arr) {
            // 1. 先创建一个栈, 这个栈用来保存当前的每一个待处理区间
            Stack<Integer> stack = new Stack<>();
            // 2. 把根节点入栈, 整个数组对应的区间
            stack.push(0);
            stack.push(arr.length - 1);
            // 3. 循环取栈顶元素
            while (!stack.isEmpty()) {
                // 取的元素就是当前的待处理区间
                // 取的顺序正好和插入的顺序相反
                int right = stack.pop();
                int left = stack.pop();
                if (left >= right) {
                    // 如果是空区间或者只有一个元素, 不需要排序
                    continue;
                }
                // 调用 partition 方法整理当前区间
                int index = partition(arr, left, right);
                // 右侧区间: [index + 1, right]
                stack.push(index + 1);
                stack.push(right);
                // 左侧区间: [left, index - 1]
                stack.push(left);
                stack.push(index - 1);
            }
        }

        public static int partition(int[] arr, int left, int right) {
            // 选取最右侧元素作为基准值.
            int v = arr[right];
            int l = left;
            int r = right;
            // 如果 l 和 r 重合, 说明遍历完成
            while (l < r) {
                // 先从左往右, 找一个比基准值大的数字.
                while (l < r && arr[l] <= v) {
                    l++;
                }
                // 当循环结束的时候, l 就指向了比基准值大的元素
                // 再从右往左, 找一个比基准值小的数字
                while (l < r && arr[r] >= v) {
                    r--;
                }
                swap(arr, l, r);
            }
            // 当 l 和 r 重合的时候, 就把重合位置的元素和基准值位置进行交换
            swap(arr, l, right);
            // 最终方法返回基准值所在的位置(l 和 r 重合的位置)
            return l;
        }

        public static void mergeSort(int[] arr) {
            _mergeSort(arr, 0, arr.length);
        }

        // 辅助递归的方法
        public static void _mergeSort(int[] arr, int left, int right) {
            if (right - left <= 1) {
                // 判定当前区间是不是只有一个元素或者没有元素
                // 此时不需要进行排序
                return;
            }
            int mid = (left + right) / 2;
            // 先让 [left, mid) 区间变成有序
            _mergeSort(arr, left, mid);
            // 再让 [mid, right) 区间变成有序
            _mergeSort(arr, mid, right);
            // 合并两个有序区间
            merge(arr, left, mid, right);
        }

        public static void mergeSortByLoop(int[] arr) {
            // gap 用于限定分组.
            // gap 值的含义就是每个待归并数组的长度
            int gap = 1;
            for (; gap < arr.length; gap *= 2) {
                // 当前两个待归并的数组
                for (int i = 0; i < arr.length; i += 2*gap) {
                    // 在这个循环中控制两个相邻的数组进行归并
                    // [left, mid) 和 [mid, right) 就要进行归并
                    int left = i;
                    int mid = i + gap;
                    if (mid >= arr.length) {
                        mid = arr.length;
                    }
                    int right = i + 2 * gap;
                    if (right >= arr.length) {
                        right = arr.length;
                    }
                    merge(arr, left, mid, right);
                }
            }
        }

        // 归并排序中的关键操作, 就是归并两个有序数组.
        // 使用该 merge 方法完成数组归并的过程
        // 此处两个数组就通过参数的 left, mid, right 描述
        // [left, mid) 左侧数组
        // [mid, right) 右侧数组
        public static void merge(int[] arr, int left, int mid, int right) {
            // 进行具体的归并操作
            // 需要创建一个临时的空间用来保存归并的结果
            // 临时空间得能保存下带归并的两个数组.
            // right - left 这么长
            if (left >= right) {
                // 空区间就直接忽略~~
                return;
            }
            int[] tmp = new int[right - left];
            int tmpIndex = 0; // 这个下标表示当前元素该放到临时空间的哪个位置上.
            int cur1 = left;
            int cur2 = mid;
            while (cur1 < mid && cur2 < right) {
                // 此处 最好写成 <= , 目的就是稳定性.
                // 由于 cur1 是在左侧区间, cur2 是在右侧区间.
                // 此时如果发现 cur1 和 cur2 的值相等,
                // 就希望左侧区间的 cur1 在最终结果中仍然是在左侧.
                // 于是就先把 cur1 对应的元素给先放到结果中.
                if (arr[cur1] <= arr[cur2]) {
                    // 把 cur1 对应的元素插入到临时空间中
                    tmp[tmpIndex] = arr[cur1];
                    tmpIndex++;
                    cur1++;
                } else {
                    // 把 cur2 对应的元素插入到临时空间中
                    tmp[tmpIndex] = arr[cur2];
                    tmpIndex++;
                    cur2++;
                }
            }
            // 循环结束之后, 需要把剩余的元素也都给拷贝到最终结果里.
            while (cur1 < mid) {
                tmp[tmpIndex] = arr[cur1];
                tmpIndex++;
                cur1++;
            }
            while (cur2 < right) {
                tmp[tmpIndex] = arr[cur2];
                tmpIndex++;
                cur2++;
            }
            // 还需要把 tmp 的结果再放回 arr 数组. (原地排序)
            // 把原始数组的 [left, right) 区间替换回排序后的结果
            for (int i = 0; i < tmp.length; i++) {
                arr[left + i] = tmp[i];
            }
        }

        public static void main(String[] args) {
            int[] arr = {9, 5, 2, 7, 3, 6, 8};
            // insertSort(arr);
//        shellSort(arr);
//        selectSort(arr);
//        heapSort(arr);
//        bubbleSort(arr);
//        quickSort(arr);
            mergeSort(arr);
            System.out.println(Arrays.toString(arr));
        }
    }