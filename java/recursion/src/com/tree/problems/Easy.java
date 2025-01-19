package com.tree.problems;

import com.tree.Node;

import java.util.ArrayList;
import java.util.List;

public class Easy {
    // Number of leaf nodes.
    public void noOfLeafNodes(Node root) {
        List<Integer> count = new ArrayList<>();
        inorderForLeafNodeCount(root, count);
        System.out.println("Count of Leaf Nodes : " + count.size());
        System.out.println("Leaf Nodes : ");
        System.out.println(count);
    }
    private void inorderForLeafNodeCount(Node root, List<Integer> leafs) {
        if (root == null) {
            return;
        }
        inorderForLeafNodeCount(root.left, leafs);
        if (root.left == null && root.right == null) {
            leafs.add(root.data);
        }
        inorderForLeafNodeCount(root.right, leafs);
    }
}
