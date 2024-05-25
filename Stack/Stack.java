package Stack;

import Linkedlist.MyLinkedlist;
import Linkedlist.Node;

public class Stack<E> {
    MyLinkedlist<E> stack;

    public Stack() {
        stack = new MyLinkedlist<E>();
    }

    public void push(E data) {
        stack.insertLast(data);
    }

    public E pop() {
        return stack.removeLast();
    }

    public int size() {
        return stack.getSize();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public String toString() {
        return stack.toString();
    }

    public E peek() {
        return stack.getLastNode();
    }

    Node<E> search(E data) {
        return stack.searchNode(data);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s);
        // s.pop();
        System.out.println();
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
    }
}
