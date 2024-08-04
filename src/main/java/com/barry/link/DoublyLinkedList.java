package com.barry.link;

import com.barry.model.DoubleNode;
import lombok.Data;

@Data
public class DoublyLinkedList<T> {

    private int size;
    private T data;
    private DoubleNode<T> head;


    public void add(DoubleNode<T> node) {
        if (head == null) {
            head = node;
        } else {
            DoubleNode<T> temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(node);
            node.setPrev(temp);
        }
        size++;
    }

    public void print() {
        DoubleNode<T> temp = head;
        while (temp != null) {
            System.out.print(temp.getData() + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public void reverse() {
        DoubleNode<T> current = head;
        DoubleNode<T> stamp = null;
        // 从头开始，一直到倒数第二个节点
        while (current.getNext() != null) {
            stamp = current.getNext();
            current.setNext(current.getPrev());
            current.setPrev(stamp);
            current = stamp;
        }
        // 最后一个节点
        current.setNext(current.getPrev());
        this.head = current;
    }

}
