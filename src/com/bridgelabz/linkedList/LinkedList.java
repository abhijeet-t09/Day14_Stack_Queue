package com.bridgelabz.linkedList;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void push(T data) {
        Node<T> node = new Node<>(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void add(T data){
        Node<T> node = new Node<>(data);
        if(head == null){
            head = node;
            tail = node;
        }
        else{
            tail.next = node;
            tail = node;
        }
    }

    public T pop() {
        T deletedElement = head.data;
        head = head.next;
        return deletedElement;
    }

    public T popLast() {
        T deletedElement = tail.data;
        Node<T> temp = head;
        while(temp.next != tail){
            temp = temp.next;
        }
        temp.next = null;
        temp = tail;
        return  deletedElement;

    }

    public void popElement(T value){
        Node<T> searchedNode = search(value);
        Node<T> temp = head;
        while(temp.next != searchedNode){
            temp = temp.next;
        }
        temp.next = searchedNode.next;

    }

    public void insert(T data) {
        Node<T> node = new Node<>(data);
        head.next = node;
        node.next = tail;
    }

    public boolean insertAfter(T searchData, T insertData) {
        Node<T> newNode = new Node<>(insertData);
        Node<T> searchedNode = search(searchData);
        if (searchedNode != null) {
            newNode.next = searchedNode.next;
            searchedNode.next = newNode;
            return true;
        }
        return false;
    }

    public Node<T> search(T searchData) {
        Node<T> temp = head;
        while(temp != null){
            if(temp.data.equals(searchData))
                return temp;
            temp = temp.next;
        }
        return null;
    }

    public int size(){
        int count=0;
        Node<T> temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }

    public T peek(){
        return head.data;
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(tail.next);
    }
}
