package Linkedlist;

public class MyLinkedlist {
    private Node head = null;

    public int getSize() {
        Node current = head;
        int size = 0;
        while (current != null) {
            current = current.getNext();
            size++;
        }
        return size;
    }

    public void showNodes() {
        Node current = head;
        while (current != null) {
            System.out.print(current.getData());
            current = current.getNext();
        }
    }

    public Node searchNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.getData() == data) {
                return current;
            }
            current = current.getNext();
        }
        return null;
    }

    public void insertLast(int data) {
        Node new_node = new Node(data);
        if (head == null) {
            head = new_node;
            head.setNext(null);
        } else {
            Node current = head;
            while (current != null) {
                if (current.getNext() == null) {
                    current.setNext(new_node);
                    return;
                }
                current = current.getNext();
            }
        }
    }

    public int removeLast() {
        Node current = head;
        if (head == null) {
            return 0;
        }
        int removed_data = 0;
        while (current.getNext().getNext() != null) {
            removed_data = current.getData();
            current = current.getNext();
        }
        current.setNext(null);
        return removed_data;
    }

    public void insertFirst(int data) {
        Node new_head = new Node(data);
        if (head != null) {
            new_head.setNext(head);
            head = new_head;
        } else {
            head = new_head;
            head.setNext(null);
        }
    }

    public int removeFirst() {
        if (head != null) {
            head = head.getNext();
            return head.getData();
        }
        return -1;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int getLastNode() {
        if (head == null) {
            return 0;
        }
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        return current.getData();

    }

    public static void main(String[] args) {
        MyLinkedlist list = new MyLinkedlist();
        // list.head = new Node(4);

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertLast(7);
        list.insertLast(8);

        // System.out.print("Linked List: ");
        // list.showNodes();
        // System.out.println();
        // System.out.print("Search Result: " + list.searchNode(2).getNext().getData());
        // // System.out.println();
        // // list.removeAfter();
        // // list.showNodes();
        // System.out.println();
        // System.out.println("Size of LinkedList" + list.getSize());
        // System.out.println("Last Node: " + list.getLastNode());
        System.out.println(list);
    }
}
