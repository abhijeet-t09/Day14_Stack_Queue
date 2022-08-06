package com.bridgelabz.stackQueue;
import com.bridgelabz.linkedList.*;

public class Stack<T> {

    LinkedList<T> linkedList;

    public Stack() {
        this.linkedList = new LinkedList<>();
    }

    public void push(T key) {
        linkedList.push(key);
    }

    public T pop() {
        return linkedList.pop();
    }

    public T peek(){
        return linkedList.peek();
    }

    public boolean isEmpty(){
        if(linkedList.size() == 0)
            return true;
        else
            return false;
    }

    public void print() {
        linkedList.print();
    }
}
