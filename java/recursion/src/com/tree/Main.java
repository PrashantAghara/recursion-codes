package com.tree;

import com.tree.build.BuildTree;
import com.tree.build.Traversal;

public class Main {
    public static void main(String[] args) {
        BuildTree buildTree = new BuildTree();
        Node root = buildTree.buildTree();
//        root = buildTree.buildTree(root);
        //1 3 5 7 11 17 -1 -1 -1 -1 -1 -1 -1
//        Node root = null;
//        root = buildTree.buildFromLevelOrder(root);

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
