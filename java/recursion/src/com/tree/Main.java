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
        System.out.println("LEVEL ORDER TRAVERSAL : ");
        traversal.levelOrderTraversal(root);

        System.out.println("INORDER TRAVERSAL : ");
        traversal.inOrderTraversal(root);
        System.out.println();
        System.out.println("POSTORDER TRAVERSAL : ");
        traversal.postOrderTraversal(root);
        System.out.println();
        System.out.println("PREORDER TRAVERSAL : ");
        traversal.preOrderTraversal(root);
    }
}
