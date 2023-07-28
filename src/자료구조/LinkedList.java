package 자료구조;

import java.util.Comparator;

public class LinkedList<E> {

    public LinkedList() {
        head = crnt = null;
    }

    private Node<E> head;
    private Node<E> crnt;

    public void addFirst(E obj) {
        Node<E> ptr = head;
        head = crnt = new Node<E>(obj, ptr);
    }

    public void addLast(E obj) {
        if (head == null) {
            addFirst(obj);
        } else {
            Node<E> ptr = head;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = crnt = new Node<E>(obj, ptr);
        }
    }

    public E search(E obj, Comparator<? super E> c) {
        Node<E> ptr = head;
        while (ptr != null) {
            if (c.compare(obj, ptr.data) == 0) {
                crnt = ptr;
                return ptr.data;
            }
            ptr = ptr.next;
        }
        return null;
    }

    public void removeFirst() {
        if (head != null) {
            head = crnt = head.next;
        }
    }

    public void removeLast() {
        if (head != null) {
            if (head.next == null) {
                removeFirst();
            } else {
                Node<E> ptr = head;
                Node<E> pre = head.next;

                while (ptr.next != null) {
                    pre = ptr;
                    ptr = ptr.next;
                }
                pre.next = null;
                crnt = pre;
            }
        }
    }

    class Node<E> {
        public E data;
        public Node<E> next;

        public Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }
    }
}
