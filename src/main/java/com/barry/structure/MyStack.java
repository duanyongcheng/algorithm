package com.barry.structure;

public class MyStack {
    private final int[] array;
    private int index;

    // Constructor
    public MyStack(int capacity) {
        array = new int[capacity];
        index = 0;
    }

    // Test method
    public static void main(String[] args) {
        MyStack stack = new MyStack(5);

        System.out.println("Is empty: " + stack.isEmpty());
        System.out.println("Size: " + stack.size());

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Size after pushing 3 elements: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Size after popping: " + stack.size());

        stack.push(4);
        stack.push(5);
        stack.push(6); // This should not be added as the stack is full

        System.out.println("Size after pushing more elements: " + stack.size());
        System.out.println("Top element: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Popped: " + stack.pop());
        }

        System.out.println("Is empty after popping all: " + stack.isEmpty());
        System.out.println("Trying to pop from empty stack: " + stack.pop());
    }

    public boolean isEmpty() {
        return index == 0;
    }

    public int size() {
        return index;
    }

    // [1,2,3,4] index = 4
    public void push(int data) {
        if (index == array.length) {
            return;
        }
        array[index] = data;
        index++;
    }

    public int pop() {
        if (index == 0) {
            return -1;
        }
        int data = array[index - 1];
        index--;
        return data;
    }

    public int peek() {
        if (index == 0) {
            return -1;
        }
        return array[index - 1];
    }

}
