package com.tree;

import com.tree.build.BuildTree;
import com.tree.build.Node;
import com.tree.build.Traversal;

public class Main {
    public static void main(String[] args) {
        BuildTree buildTree = new BuildTree();
        Node root = buildTree.buildTree();
//        root = buildTree.buildTree(root);

        Traversal traversal = new Traversal();
        traversal.levelOrderTraversal(root);
    }
}
