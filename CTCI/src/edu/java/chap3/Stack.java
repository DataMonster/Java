//this is a simple stack class.
class Stack{
    Node top;
    Node pop(){
        if(top!=null){
              Object item = top.data;
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

