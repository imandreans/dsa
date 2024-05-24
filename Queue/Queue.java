package Queue;

import Linkedlist.MyLinkedlist;

public class Queue {
    MyLinkedlist queue;

    public Queue() {
        queue = new MyLinkedlist();
    }

    public void enqueue(int data) {
        queue.insertLast(data);
    }

    public int dequeue() {
        return queue.removeFirst();
    }

    public int size() {
        return queue.getSize();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void show() {
        queue.showNodes();
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(5);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(2);
        q.enqueue(1);
        q.show();
        System.out.println();
        q.dequeue();
        q.show();
        System.out.println();
        System.out.println(q.isEmpty());
    }

}
