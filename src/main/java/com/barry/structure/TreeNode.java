package com.barry.structure;

import lombok.Data;

@Data
public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int data) {
        this.val = data;
    }
}
