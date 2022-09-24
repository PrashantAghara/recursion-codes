package com.recursion.ibh;

import java.util.Stack;

public class StackOperation {
    public void sort(Stack<Integer> stack) {
        if (stack.size() == 1) {
            return;
        }
        int temp = stack.pop();
        sort(stack);
        insert(stack, temp);
    }

    private void insert(Stack<Integer> stack, int temp) {
        if (stack.size() == 0 || stack.peek() <= temp) {
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        insert(stack, temp);
        stack.push(val);
    }

    public void deleteMiddle(Stack<Integer> stack, int k) {
        if (k == 1) {
            stack.pop();
            return;
        }
        int temp = stack.pop();
        deleteMiddle(stack, k - 1);
        stack.push(temp);
    }

    public void reverse(Stack<Integer> stack) {
        if (stack.size() == 1) {
            return;
        }
        int temp = stack.pop();
        reverse(stack);
        insertRev(stack, temp);
    }

    private void insertRev(Stack<Integer> stack, int temp) {
        if (stack.isEmpty()) {
            stack.push(temp);
            return;
        }
        int val = stack.pop();
        insertRev(stack, temp);
        stack.push(val);
    }
}
