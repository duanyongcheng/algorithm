package com.barry.structure;

public class Deque {
    // 固定数组实现的双端队列
    // 主要通过循环队列的思想实现的
    private final int[] array;

    private final int limit;

    private int size;

    private int right;

    private int left;

    public Deque(int k) {
        array = new int[k];
        limit = k;
        size = 0;
        right = 0;
        left = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    // 从头部弹出
    public int popFirst() {
        if (isEmpty()) {
            throw new RuntimeException("is empty");
        }
        int data = array[left];
        if (left == limit - 1) {
            left = 0;
        } else {
            left++;
        }
        size--;
        return data;
    }

    public int peekFirst() {
        if (isEmpty()) {
            throw new RuntimeException("is empty");
        }
        return array[left];
    }

    // 从头部加
    public boolean offerFirst(int data) {
        if (size == limit) {
            return false;
        }
        if (size != 0) {
            if (left == 0) {
                left = limit - 1;
            } else {
                left--;
            }
        }
        array[left] = data;
        size++;
        return true;
    }

    public int popLast() {
        if (isEmpty()) {
            throw new RuntimeException("is empty");
        }
        int data = array[right];
        if (right == 0) {
            right = limit - 1;
        } else {
            right--;
        }
        size--;
        return data;
    }

    public int peekLatest() {
        if (isEmpty()) {
            throw new RuntimeException("is empty");
        }
        return array[right];
    }

    public boolean offerLatest(int data) {
        if (size == limit) {
            return false;
        }
        if (size != 0) {
            if (right == limit - 1) {
                right = 0;
            } else {
                right++;
            }
        }
        array[right] = data;
        size++;
        return true;
    }
}
