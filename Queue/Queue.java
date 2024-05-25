package Queue;

import Linkedlist.MyLinkedlist;

public class Queue<E> {
    MyLinkedlist<E> queue;

    public Queue() {
        queue = new MyLinkedlist<E>();
    }

    public void enqueue(E data) {
        queue.insertLast(data);
    }

    public E dequeue() {
        return queue.removeFirst();
    }

    public int size() {
        return queue.getSize();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void show() {
        System.out.println(queue);
    }

    public static void main(String[] args) {
        Queue<Integer> q = new Queue<Integer>();
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
