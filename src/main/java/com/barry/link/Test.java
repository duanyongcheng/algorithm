package com.barry.link;

import com.barry.model.Node;

public class Test {
    public static void main(String[] args) {
        SingleLinkedList<Integer> singleLinkedList = new SingleLinkedList<>();
        singleLinkedList.add(new Node<>(1));
        singleLinkedList.add(new Node<>(2));
        singleLinkedList.add(new Node<>(3));
        singleLinkedList.add(new Node<>(4));
        singleLinkedList.add(new Node<>(5));
        singleLinkedList.print();
        singleLinkedList.reverse();
        singleLinkedList.print();
    }
}
