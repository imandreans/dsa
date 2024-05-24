package Stack;

import Linkedlist.MyLinkedlist;
import Linkedlist.Node;

public class Stack {
    MyLinkedlist stack;

    public Stack() {
        stack = new MyLinkedlist();
    }

    public void push(int data) {
        stack.insertLast(data);
    }

    public int pop() {
        return stack.removeLast();
    }

    public int size() {
        return stack.getSize();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void show() {
        stack.showNodes();
    }

    public int peek() {
        return stack.getLastNode();
    }

    Node search(int data) {
        return stack.searchNode(data);
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(5);
        s.push(4);
        s.push(3);
        s.push(2);
        s.push(1);
        s.show();
        System.out.println();
        // s.pop();
        s.show();
        System.out.println();
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
    }
}
