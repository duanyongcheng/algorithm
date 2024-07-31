package com.barry.model;

import lombok.Data;

@Data
public class Node<T> {
   private T data;
   private Node<T> next;

   public Node (T t){
        this.data = t;
   }
}
