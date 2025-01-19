package com.tree.build;

import com.tree.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
  1
 /  \
 3   5
/ \  / \
7 11 17 NULL
 */
public class BuildTree {
    Scanner sc = new Scanner(System.in);
    public Node buildTree(Node root) {
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

    public Node buildFromLevelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        System.out.println("Enter the data for root : ");
        int data = sc.nextInt();
        root = new Node(data);
        queue.add(root);

        while (!queue.isEmpty()) {
            Node temp = queue.poll();

            System.out.println("Enter left node for " + temp.data + " : ");
            int leftData = sc.nextInt();

            if (leftData != -1) {
                temp.left = new Node(leftData);
                queue.add(temp.left);
            }
            System.out.println("Enter right node for " + temp.data + " : ");
            int rightData = sc.nextInt();

            if (rightData != -1) {
                temp.right = new Node(rightData);
                queue.add(temp.right);
            }
        }

        return root;
    }
}
