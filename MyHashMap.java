public class MyHashMap {
    class HashNode {
        public int key;
        public int value;
        HashNode next;

        public HashNode(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private HashNode[] arry = new HashNode[16];
    private int size = 0;

    private int hashCode(int key){
        return key % arry.length;
    }

    public void put(int key,int value){
        int index = hashCode(key);
        for(HashNode cur = arry[index];cur != null;cur = cur.next){
            if(cur.key == key){
                cur.value = value;
                return;
            }
        }
        HashNode newNode = new HashNode(key,value);
        newNode.next = arry[index];
        arry[index] = newNode;
        size++;

        if(loadFactor() > 0.75){
            resize();
        }
    }

    private double loadFactor(){
        return (double)size/arry.length;
    }

    private void resize(){
        HashNode[] newArray = new HashNode[arry.length * 2];
        for (int i = 0; i < arry.length; i++) {
            HashNode next = null;
            for(HashNode cur = arry[i];cur != null;cur = next){
                next = cur.next;
                int newIndex = cur.key % newArray.length;
                cur.next = newArray[newIndex];
                newArray[newIndex] = cur;
            }
        }
        arry = newArray;
    }

    public Integer get(int key){
        int index = hashCode(key);
        for(HashNode cur = arry[index];cur != null;cur = cur.next){
            if(cur.key == key){
                return cur.value;
            }
        }
        return null;
    }

    public void remove(int key){
        // 链表删除操作
    }
}