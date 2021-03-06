package edu.java.chap3;

import edu.java.chap2.Node;

//this is a simple queue class

class Queue{
    Node first, last;
    void enqueue(Object item) {
        if(first!=null) {
            last = new Node(item);
            first = last;
        } else {
            last.next = new Node(item);
            last = last.next;
        }
    }
    Object dequeue(Node n) {
        if (first != null) {
            Object item = first.data2;
            first = first.next;
            return item;
        }
        return null;
    }
}
