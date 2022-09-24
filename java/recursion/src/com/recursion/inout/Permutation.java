package com.recursion.inout;

public class Permutation {

    public void printPermutationWithSpaces(String in, String out) {
        if (in.length() == 0) {
            System.out.println(out);
            return;
        }
        String op1 = out;
        String op2 = out;
        op1 = op1.concat(String.valueOf(in.charAt(0)));
        op2 = op2.concat(" " + in.charAt(0));
        in = in.substring(1);
        printPermutationWithSpaces(in, op1);
        printPermutationWithSpaces(in, op2);
    }

    public void printPermutationWithChange(String in, String out) {
        if (in.length() == 0) {
            System.out.println(out);
            return;
        }
        String op1 = out;
        String op2 = out;
        op1 = op1.concat(String.valueOf(in.charAt(0)));
        op2 = op2.concat(String.valueOf(in.charAt(0)).toUpperCase());
        in = in.substring(1);
        printPermutationWithChange(in, op1);
        printPermutationWithSpaces(in, op2);
    }

}
