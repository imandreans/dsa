package Linkedlist;

public class Node<E> {
    E data;
    Node<E> next;

    public Node(E data) {
        this.data = data;
        next = null;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

    public void setData(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }
}
