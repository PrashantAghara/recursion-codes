package com.tree.build;

import java.util.Scanner;

/*
  1
 /  \
 3   5
/ \  / \
7 11 17 NULL
 */
public class BuildTree {
    public Node buildTree(Node root) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the data : ");
        int data = sc.nextInt();
        root = new Node(data);
        if (data == -1) {
            return null;
        }

        System.out.println("Enter the data for left of " + data);
        root.left = buildTree(root.left);

        System.out.println("Enter the data for right of " + data);
        root.right = buildTree(root.right);

        return root;
    }

    public Node buildTree() {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(5);
        root.left.left = new Node(7);
        root.left.right = new Node(11);
        root.right.left = new Node(17);
        return root;
    }
}
