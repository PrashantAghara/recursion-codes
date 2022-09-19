package com.recursion.ibh;

public class LeetCodeSolution {
    //Kth Symbol in Grammar (LeetCode => DIFF : MEDIUM)
    public int generate(int n, int k) {
        if (n == 1 && k == 1) {
            return 0;
        }
        int mid = (int) ((Math.pow(2, n - 1)) / 2);
        if (k <= mid) {
            return generate(n - 1, k) ^ 1;
        } else {
            return generate(n - 1, k - mid) & 0;
        }
    }
}
