package edu.java.chap3;

import edu.java.chap2.Node;

//this is a simple stack class.
class Stack2{
    Node top;
    Object pop(){
        if(top!=null){
              Object item = top.data2;
              top = top.next;
              return item;
        }
        return null;
    }
    void push(Object item){
        Node t = new Node(item);
        t.next = top;
        top = t;
    }
}

