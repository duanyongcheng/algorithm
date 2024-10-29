package com.barry.structure;

public class MyQueue2 {
    // 使用栈实现队列
    // 有两个栈一个是in 一个是out
    // 1. 入队列的时候进入in
    // 2. 出队列从out出
    // 3. 如果out为空，把in的倒入out，一定要倒完
    private final MyStack in;
    private final MyStack out;

    public MyQueue2(int size) {
        in = new MyStack(size);
        out = new MyStack(size);
    }

    public boolean isEmpty() {
        return in.isEmpty() && out.isEmpty();
    }

    public int size() {
        return in.size() + out.size();
    }

    public void push(int data) {
        in.push(data);
    }

    public int pop() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        if (out.isEmpty()) {
            throw new RuntimeException("is Empty");
        }
        return out.pop();
    }

    public int peek() {
        if (out.isEmpty()) {
            while (!in.isEmpty()) {
                out.push(in.pop());
            }
        }
        if (out.isEmpty()) {
            throw new RuntimeException("is Empty");
        }
        return out.peek();
    }

}
