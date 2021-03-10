package StackQueue;

public class MyQueue1 {
    private int[] data = new int[100];
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    public boolean offer(int val){
        if(size == data.length){
            return false;
        }
        data[tail] = val;
        tail++;
        if(tail == data.length){
            tail = 0;
        }
        size++;
        return true;
    }

    public Integer poll(){
        if(size == 0){
            return null;
        }
        int ret = data[head];
        head++;
        if(head == data.length){
            head = 0;
        }
        size--;
        return ret;
    }

    public Integer peek(){
        if(size == 0){
            return null;
        }
        return data[head];
    }
}