package com.recursion.extended;

import java.util.ArrayList;
import java.util.List;

public class Parenthesis {
    private void generate(int open, int close, String out, List<String> list) {
        if (open == 0 && close == 0) {
            list.add(out);
            return;
        }
        if (open != 0) {
            String op1 = out;
            op1 = op1.concat("(");
            generate(open - 1, close, op1, list);
        }
        if (close > open) {
            String op1 = out;
            op1 = op1.concat(")");
            generate(open, close - 1, op1, list);
        }
    }

    public List<String> getBalanceParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(n, n, "", list);
        return list;
    }
}
