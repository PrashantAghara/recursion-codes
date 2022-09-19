package com.recursion.ibh;

public class TowerOfHonoi {
    public void printSteps(int n, int source, int helper, int dest) {
        if (n == 1) {
            System.out.println(n + " plate from " + source + " to " + dest);
            return;
        }
        printSteps(n - 1, source, dest, helper);
        System.out.println(n + " plate from " + source + " to " + dest);
        printSteps(n - 1, helper, source, dest);
    }
}
