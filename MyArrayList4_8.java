import java.util.Arrays;

public class MyArrayList4_8 {
    private String[] arr = null;
    private int size = 0;
    private int capacity = 100;

    public MyArrayList4_8() {
        arr = new String[capacity];
    }

    public void add(String e){
        if(size >= capacity){
            realloc();
        }
        arr[size] = e;
        size++;
    }

    private void realloc() {
        capacity *= 2;
        String[] newArr = new String[capacity];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        arr = newArr;
    }

    public void add(int index,String e){
        if(index < 0 || index >= size){
            return;
        }
        if(size >= capacity){
            realloc();
        }
        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }
        arr[index] = e;
        size++;
    }

    public String remove(int index){
        if(index < 0 || index >= size){
            return null;
        }
        String ret = arr[index];
        for (int i = index + 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }
        size--;
        return ret;
    }

    public boolean remove(String e){
        int i = 0;
        for (; i < size; i++) {
            if(e.equals(arr[i])){
                break;
            }
        }
        if(i >= size){
            return false;
        }
        for (int j = i; j < size - 1; j++) {
            arr[j] = arr[j + 1];
        }
        size--;
        return true;
    }

    public String get(int index){
        if(index < 0 || index >= size){
            return null;
        }
        return arr[index];
    }

    public void set(int index,String e){
        if(index < 0 || index >= size){
            return;
        }
        arr[index] = e;
    }

    public boolean contains(String e){
        for (int i = 0; i < size; i++) {
            if(e.equals(arr[i]))
                return true;
        }
        return false;
    }

    public int indexOf(String e){
        for (int i = 0; i < size; i++) {
            if(e.equals(arr[i]))
                return i;
        }
        return -1;
    }

    public int lastIndexOf(String e){
        for (int i = size - 1; i >= 0; i--) {
            if(e.equals(arr[i]))
                return i;
        }
        return -1;
    }

    public void clear(){
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < size; i++) {
            str += arr[i];
            if(i != size - 1)
                str += ",";
        }
        str += "]";
        return str;
    }

    public static void main(String[] args) {
        MyArrayList4_8 myArrayList48 = new MyArrayList4_8();
        myArrayList48.add("a");
        myArrayList48.add(0,"b");
        System.out.println(myArrayList48);
        myArrayList48.remove(0);
        myArrayList48.remove("a");
        System.out.println(myArrayList48);
        myArrayList48.add("a");
        myArrayList48.add(0,"b");
        myArrayList48.set(1,"c");
        System.out.println(myArrayList48.get(1));
        System.out.println(myArrayList48.contains("d"));
        System.out.println(myArrayList48.indexOf("c"));
        System.out.println(myArrayList48.lastIndexOf("c"));
    }
}