package com.recursion.extended;

public class BinaryNumber {
    public void generateNDigitBinaryNumber(int n, String out, int ones, int zeros) {
        if (n == 0) {
            System.out.println(out);
            return;
        }
        String out1 = out;
        out1 = out1.concat("1");
        generateNDigitBinaryNumber(n - 1, out1, ones + 1, zeros);
        if (ones > zeros) {
            String out2 = out;
            out2 = out2.concat("0");
            generateNDigitBinaryNumber(n - 1, out2, ones, zeros + 1);
        }
    }
}
