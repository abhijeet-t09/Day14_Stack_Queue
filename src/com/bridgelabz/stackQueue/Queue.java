package com.bridgelabz.stackQueue;
import com.bridgelabz.linkedList.*;

public class Queue<T> {
    LinkedList<T> linkedList;

    public Queue() {
        this.linkedList = new LinkedList<>();
    }

    public void enqueue(T key) {
        linkedList.add(key);
    }

    public boolean isEmpty(){
        if(linkedList.size() == 0)
            return true;
        else
            return false;
    }

    public T peek(){
        return linkedList.peek();
    }

    public T dequeue() {
        return linkedList.pop();
    }

    public void print() {
        linkedList.print();
    }
}
