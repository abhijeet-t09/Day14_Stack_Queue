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

    public void print() {
        linkedList.print();
    }
}
