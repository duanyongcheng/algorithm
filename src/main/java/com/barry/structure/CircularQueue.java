package com.barry.structure;

public class CircularQueue {
    // 这个是可以重复利用数组位置的环形队列
    private final int[] data;
    // 最大数据
    private final int limit;
    private int left;
    private int right;
    private int size;

    public CircularQueue(int size) {
        data = new int[size];
        limit = size;
        left = 0;
        right = 0;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        size--;
        if (left == limit - 1) {
            left = 0;
            return data[limit - 1];
        } else {
            return data[left++];
        }
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("queue is empty");
        }
        if (left == limit - 1) {
            return data[limit - 1];
        } else {
            return data[left];
        }
    }

    public void pull(int val) {
        if (size == limit - 1) {
            throw new RuntimeException("queue if full");
        }
        size++;
        data[right] = val;
        if (right == limit - 1) {
            right = 0;
        } else {
            right++;
        }

    }
}
