import java.util.HashMap;

class HashNode {
    public int key;
    public int value;
    HashNode next;

    public HashNode(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

public class Test3_27_2 {
        // 哈希表的核心是有一个数组, 数组上的每个元素又是一个链表
        private HashNode[] array = new HashNode[16];
        private int size = 0;

        // 通过这个方法, 希望把 key 映射成数组下标
        private int hashCode(int key) {
            // 此处是简单求余. 实际上可以根据情况选取更复杂的计算方式
            // 比如根据 key 计算 md5 值再求余
            return key % array.length;
        }

        // 核心方法
        public void put(int key, int value) {
            // 1. 先根据 key, 计算出 下标位置
            int index = hashCode(key);
            // 2. 看看 key 在 hash 表中是否存在
            //    如果存在, 就直接修改 value, 不存在就直接插入新节点
            for (HashNode cur = array[index]; cur != null; cur = cur.next) {
                if (cur.key == key) {
                    // 这就说明找到了相同 key 的元素, 直接修改 value
                    cur.value = value;
                    return;
                }
            }
            // 3. 如果经过上面的循环, 没有找到匹配的 key, 就该 key 不存在,
            //    就需要创建新的节点插入到链表上去(头插)
            HashNode newNode = new HashNode(key, value);
            newNode.next = array[index];
            array[index] = newNode;
            size++;

            // 4. 如果持续插入, 就可能导致冲突概率越来越大, 链表越来越长,
            //    就会影响到后续操作的效率, 就可以考虑进行扩容
            //    为了衡量 啥时候扩容 , 引入一个概念, "负载因子"
            //    计算 元素个数 / 数组长度
            if (loadFactor() > 0.75) {
                // 认为比较拥挤了, 就要进行扩容了
                resize();
            }
        }

        private void resize() {
            // 搞一个更大的数组, 把旧的元素搬运过去就行了
            HashNode[] newArray = new HashNode[array.length * 2];
            // 遍历旧的hash表, 进行搬运
            for (int i = 0; i < array.length; i++) {
                HashNode next = null;
                for (HashNode cur = array[i]; cur != null; cur = next) {
                    next = cur.next;
                    int newIndex = cur.key % newArray.length;
                    // 把当前 cur 对应的节点给插入到新的数组上
                    cur.next = newArray[newIndex];
                    newArray[newIndex] = cur;
                }
            }
            array = newArray;
        }

        private double loadFactor() {
            return (double)size / array.length;
        }

        public Integer get(int key) {
            int index = hashCode(key);
            // 遍历对应的链表
            for (HashNode cur = array[index]; cur != null; cur = cur.next) {
                if (cur.key == key) {
                    return cur.value;
                }
            }
            return null;
        }

        public void remove(int key) {
            // TODO 同学们自己来写~~ (本质就是链表删除)
        }

        public static void main(String[] args) {
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("a", "b");
        }
    }