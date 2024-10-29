package com.barry.structure;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack2 {
    // 使用队列实现栈 先进后出
    // 再每次加入的时候把前面的先pop再按顺序加入

    private final Queue<Integer> data = new LinkedList<>();

    public int pop() {
        if (data.isEmpty()) {
            throw new RuntimeException("");
        }
        return data.poll();
    }

    public int peek() {
        if (data.isEmpty()) {
            throw new RuntimeException("");
        }
        return data.peek();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public int size() {
        return data.size();
    }

    // [1]
    // add 2 : 先push 2 , 然后pop size 次依次push
    public void push(int val) {
        int size = data.size();
        data.add(val);
        for (int i = 0; i < size; i++) {
            data.add(data.poll());
        }
    }

}
