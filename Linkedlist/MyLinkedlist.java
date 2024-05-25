package Linkedlist;

public class MyLinkedlist<E> {
    private Node<E> head;

    public int getSize() {
        Node<E> current = head;
        int size = 0;
        while (current != null) {
            current = current.getNext();
            size++;
        }
        return size;
    }

    @Override
    public String toString() {
        String temp = "";
        Node<E> current = head;
        while (current != null) {
            temp = temp + ", " + current.getData();
            current = current.getNext();
        }
        return temp;
    }

    public Node<E> searchNode(E data) {
        Node<E> current = head;
        while (current != null) {
            if (current.getData() == data) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void insertLast(E data) {
        Node<E> new_Node = new Node<E>(data);
        if (head == null) {
            head = new_Node;
            head.setNext(null);
        } else {
            Node<E> current = head;
            while (current != null) {
                if (current.getNext() == null) {
                    current.setNext(new_Node);
                    return;
                }
                current = current.getNext();
            }
        }
    }

    public E removeLast() {
        Node<E> current = head;
        Node<E> previous = null;
        if (head == null) {
            return null;
        }

        // E removed_data = null;
        while (current.next != null) {
            // removed_data = current.getData();
            previous = current;
            current = current.getNext();
        }

        if (previous == null) {
            head = null;
        } else {
            previous.next = null;
        }
        E data = current.data;
        current.setNext(null);
        return data;
    }

    public void insertFirst(E data) {
        Node<E> new_head = new Node<E>(data);
        if (head != null) {
            new_head.setNext(head);
            head = new_head;
        } else {
            head = new_head;
            head.setNext(null);
        }
    }

    public E removeFirst() {

        if (head != null) {
            E data = head.data;
            head = head.next;
            return data;
        }
        return null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public E getLastNode() {
        if (head == null) {
            return null;
        }
        Node<E> current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current.getData();

    }

    public static void main(String[] args) {
        MyLinkedlist<Integer> list = new MyLinkedlist<Integer>();
        // list.head = new Node<e>(4);

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(7);
        list.insertFirst(8);
        ;
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
