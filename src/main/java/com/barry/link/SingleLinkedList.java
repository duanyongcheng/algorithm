package com.barry.link;

import com.barry.model.Node;
import lombok.Data;

@Data
public class SingleLinkedList<T> {
    private Node<T> head;
    private int size;

    // 在最后加一个
    public void add(Node<T> node) {
        if ((head == null)) {
            head = node;
            size++;
            return;
        }
        Node<T> temp = head;
        while (temp.getNext() != null) {
            temp = temp.getNext();
        }
        temp.setNext(node);
        size++;
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public void reverse() {
        Node<T> pre = null;
        Node<T> next = null;
        Node<T> cur = head;
        while (cur != null) {
            next = cur.getNext();
            cur.setNext(pre);
            pre = cur;
            cur = next;
        }
        head = pre;
    }
}
