package com.recursion.ibh;

import java.util.List;

public class Sort {

    public void sort(List<Integer> arr) {
        if (arr.size() == 1) {
            return;
        }

        int temp = arr.get(arr.size() - 1);
        arr.remove(arr.size() - 1);
        sort(arr);
        insert(arr, temp);
    }


    private void insert(List<Integer> list, int temp) {
        if (list.isEmpty() || list.get(list.size() - 1) <= temp) {
            list.add(temp);
            return;
        }
        int temp1 = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        insert(list, temp);
        list.add(temp1);
    }
}
