package com.recursion.ibh;

import java.util.ArrayList;
import java.util.List;

public class Josephus {
    private int getPosition(List<Integer> arr, int k, int index) {
        if (arr.size() == 1) {
            return arr.get(0);
        }
        index = (index + k) % arr.size();
        arr.remove(index);
        return getPosition(arr, k, index);
    }

    public int getAlivePosition(int n, int k) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            arr.add(i);
        }
        return this.getPosition(arr, k - 1, 0);
    }
}
