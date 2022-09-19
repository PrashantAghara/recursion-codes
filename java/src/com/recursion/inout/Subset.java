package com.recursion.inout;

import java.util.ArrayList;
import java.util.List;

public class Subset {
    private void addSubset(String in, String out, List<String> list) {
        if (in.length() == 0) {
            list.add(out);
            return;
        }
        String out2 = out;
        out2 = out2.concat(String.valueOf(in.charAt(0)));
        in = in.substring(1);
        addSubset(in, out, list);
        addSubset(in, out2, list);
    }

    public void printSubset(String in, String out) {
        List<String> subsets = new ArrayList<>();
        addSubset(in, out, subsets);
        System.out.println(subsets);
    }

    public void printUniqueSubset(String in, String out) {
        List<String> subsets = new ArrayList<>();
        addSubset(in, out, subsets);
        List<String> uniqueList = new ArrayList<>();
        subsets.forEach((s -> {
            if (!uniqueList.contains(s)) {
                uniqueList.add(s);
            }
        }));
        System.out.println(uniqueList);
    }
}
