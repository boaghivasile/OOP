package com.Vasilica.Laborator2.Task2;

public class Queue {
    private int[] list;
    private int last;
    private int num_elements;
    private int current;

    public Queue(){
        this.num_elements = 20;
        list = new int[num_elements];
        last = -1;
    }

    public Queue(int num_elements){
        this.num_elements = num_elements;
        list = new int[num_elements];
        last = -1;
    }

    public int pop() {
        return list[current--];
    }

    public boolean isFull(){
        return last == num_elements - 1;
    }

    public boolean isEmpty(){
        return last == -1;
    }

    public void add(int value){
        last++;
        current = num_elements;
        if(last >= num_elements){
            int[] tempArray = new int[last];
            System.arraycopy(list, 0, tempArray, 0, last);
            list = new int[last+1];
            System.arraycopy(tempArray, 0, list, 0, last);
        }

        list[last] = value;
    }

    int get(int index){
        if(index >= 0 && index < this.num_elements){
            return list[index];
        }
        return -1;
    }
}
