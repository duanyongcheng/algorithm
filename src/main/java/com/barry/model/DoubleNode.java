package com.barry.model;

import com.barry.link.DoublyLinkedList;
import lombok.Data;

@Data
public class DoubleNode<T> {

    private T data;
    private DoubleNode<T> prev;
    private DoubleNode<T> next;

    public DoubleNode(T t){
        this.data = t;
    }

}
