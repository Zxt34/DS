class MyArrayListIndexOutOfRangeException extends RuntimeException{
    public MyArrayListIndexOutOfRangeException(String message){
        super(message);
    }
}

public class MyArrayList {
    private String[] data = null;
    private int size = 0;
    private int capacity = 100;

    public MyArrayList(){           //常量和引用类型在构造方法里初始化
        data = new String[capacity];
    }

    public void add(String e) {
        if(size >= capacity)
            realloc();
        data[size] = e;
        size++;
    }

    private void realloc() {
        capacity *= 2;
        String[] newData = new String[capacity];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void add(int index, String e) {
        if(index < 0 || index >= size)
            return;
        if(size >= capacity)
            realloc();
        for (int i = size - 1; i >= index; i--) {
            data[i+1] = data[i];
        }
        data[index] = e;
        size++;
    }

    public String remove(int index) {
        if(index < 0 || index >= size)
            return null;
        String res = data[index];
        for (int i = index + 1; i < size; i++) {
            data[i-1] = data[i];
        }
        size--;
        return res;
    }

    public boolean remove(String e) {
        int i = 0;
        for (; i < size; i++) {
            if(e.equals(data[i]))
                break;
        }
        if(i >= size)
            return false;
        for (int j = i; j < size - 1; j++) {
            data[i] = data[i+1];
        }
        size--;
        return true;
    }

    public String get(int index) {
        if(index < 0 || index >= size)
            throw new MyArrayListIndexOutOfRangeException("下标越界了! index: " + index);
        return data[index];
    }

    public void set(int index, String e) {
        if(index < 0 || index >= size)
            throw new MyArrayListIndexOutOfRangeException("下标越界了! index: " + index);
        data[index] = e;
    }

    public boolean contains(String e) {
        int i = 0;
        for (; i < size; i++) {
            if(e.equals(data[i]))
                return true;
        }
            return false;
    }

    public int indexOf(String e) {
        for (int i = 0; i < size; i++) {
            if(e.equals(data[i]))
                return i;
        }
        return -1;
    }

    public int lastIndexOf(String e) {
        for (int i = size - 1; i >= 0; i--) {
            if(data[i].equals(e))
                return i;
        }
        return -1;
    }

    public void clear() {
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += data[i];
            if(i != size - 1)
                str += ",";
        }
        str += "]";
        return str;
    }

    private static void testAdd() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("hello");
        myArrayList.add("hi");
        myArrayList.add("good");
        myArrayList.add("nice");
        myArrayList.add(1, "world");
        System.out.println(myArrayList);
    }

    private static void testRemove() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("hello");
        myArrayList.add("hi");
        myArrayList.add("good");
        myArrayList.add("nice");
        myArrayList.remove(1);
        myArrayList.remove("good");
        System.out.println(myArrayList);
    }

    private static void testGetAndSet() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("hello");
        myArrayList.add("hi");
        myArrayList.add("good");
        myArrayList.add("nice");
        System.out.println(myArrayList.get(1));
        myArrayList.set(1, "world");
        System.out.println(myArrayList);
        myArrayList.get(120);
    }

    private static void testContainsAndIndexOf() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("hello");
        myArrayList.add("world");
        myArrayList.add("hi");
        myArrayList.add("good");
        myArrayList.add("nice");
        System.out.println(myArrayList.contains("hi"));
        System.out.println(myArrayList.indexOf("world"));
        System.out.println(myArrayList.lastIndexOf("good"));
    }

    private static void testSizeEmptyClear() {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add("hello");
        myArrayList.add("world");
        myArrayList.add("hi");
        myArrayList.add("good");
        myArrayList.add("nice");
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.isEmpty());
        myArrayList.clear();
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.isEmpty());
    }

    public static void main(String[] args) {
        testAdd();
        testRemove();
//        testGetAndSet();
        testContainsAndIndexOf();
        testSizeEmptyClear();
    }
}