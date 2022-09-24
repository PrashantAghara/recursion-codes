package com.recursion.inout;

import java.util.ArrayList;
import java.util.List;

public class Letter {

    public void printLetterCaseChange(String in) {
        String out = "";
        List<String> list = new ArrayList<>();
        generate(in, out, list);
        System.out.println(list);
    }

    private void generate(String in, String out, List<String> list) {
        if (in.length() == 0) {
            list.add(out);
            return;
        }
        if (Character.isDigit(in.charAt(0))) {
            String out1 = out;
            out1 = out1.concat(String.valueOf(in.charAt(0)));
            in = in.substring(1);
            generate(in, out1, list);
        } else {
            String op1 = out;
            String op2 = out;
            op1 = op1.concat(String.valueOf(in.charAt(0)).toLowerCase());
            op2 = op2.concat(String.valueOf(in.charAt(0)).toUpperCase());
            in = in.substring(1);
            generate(in, op1, list);
            generate(in, op2, list);
        }
    }
}
