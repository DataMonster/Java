//this is a simple queue class

class Queue{
    Node first, last;
    void enqueue(Object item) {
        if(!first) {
            back = new Node(item);
            first = back;
        } else {
            back.next = new Node(item);
            back = back.next;
        }
    }
    Node dequeue(Node n) {
        if (first != null) {
            Object item = first.data;
            first = first.next;
            return item;
        }
        return null;
    }
}
