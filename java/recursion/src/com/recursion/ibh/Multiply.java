package com.recursion.ibh;

import java.util.List;

public class Multiply {
    public int mul(List<Integer> arr, int size) {
        if (size == 1) {
            return arr.get(0);
        }
        int temp = arr.get(size - 1);
        int ans = mul(arr, size - 1);
        return ans * temp;
    }
}
