package com.barry.code.tree;

import com.barry.structure.TreeNode;

import java.util.Stack;

// 不用递归，用迭代的方式实现二叉树的三序遍历
public class BinaryTreeTraversalIteration {

    // 先序打印所有节点，非递归版
    public static void preOrder(TreeNode head) {
        if (head != null) {
            Stack<TreeNode> stack = new Stack<>();
            stack.push(head);
            while (!stack.isEmpty()) {
                head = stack.pop();
                System.out.print(head.getVal() + " ");
                if (head.getRight() != null) {
                    stack.push(head.getRight());
                }
                if (head.getLeft() != null) {
                    stack.push(head.getLeft());
                }
            }
        }
    }

    public static void inOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || head != null) {
            if (head != null) {
                stack.push(head);
                head = head.getLeft();
            } else {
                // 没有左树了
                head = stack.pop();
                System.out.print(head.getVal() + " ");
                head = head.getRight();
            }
        }
    }

    public static void postOrder(TreeNode head) {
        if (head == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(head);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.peek();
            if (cur.getLeft() != null && cur.getLeft() != head && cur.getRight() != head) {
                // 当前节点的左节点完全没有处理过
                stack.push(cur.getLeft());
            } else if (cur.getRight() != null && cur.getRight() != head) {
                // 当前节点的右节点没有处理过
                stack.push(cur.getRight());
            } else {
                // 当前节点的左右节点为null 或者左右节点都处理过了
                System.out.print(cur.getVal() + " ");
                head = stack.pop();
            }
        }
    }
}
