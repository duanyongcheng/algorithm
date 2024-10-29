package com.barry.structure;

public class MyQueue {
    private final int[] array;
    private int left;
    private int right;

    public MyQueue(int size) {
        array = new int[size];
        left = 0;
        right = 0;
    }

    public boolean isEmpty() {
        return left == right;
    }

    public int size() {
        return right - left;
    }

    public void push(int data) {
        if (right == array.length) {
            return;
        }
        array[right] = data;
        right++;
    }

    public int pop() {
        if (right == left) {
            return -1;
        }
        int data = array[left];
        left++;
        return data;
    }

    public int peek() {
        if (right == left) {
            return -1;
        }
        return array[left];
    }
}
