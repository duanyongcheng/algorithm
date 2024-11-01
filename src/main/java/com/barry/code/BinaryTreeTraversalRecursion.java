package com.barry.code;

import com.barry.structure.TreeNode;

// 二叉树的递归遍历
public class BinaryTreeTraversalRecursion {
    // 前序遍历
    public void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.getVal());
        preOrder(root.getLeft());
        preOrder(root.getRight());
    }

    // 中序遍历
    public void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.getLeft());
        System.out.println(root.getVal());
        inOrder(root.getRight());
    }

    // 后序遍历
    public void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        postOrder(root.getLeft());
        postOrder(root.getRight());
        System.out.println(root.getVal());
    }

}
