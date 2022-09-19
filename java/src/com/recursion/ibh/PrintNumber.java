package com.recursion.ibh;

public class PrintNumber {
    public void print(int n) {
        if (n == 1){
            System.out.println(1);
            return;
        }
        print(n-1);
        System.out.println(n);
    }

    public void printRev(int n) {
        if (n == 1){
            System.out.println(1);
            return;
        }
        System.out.println(n);
        printRev(n-1);
    }
}
