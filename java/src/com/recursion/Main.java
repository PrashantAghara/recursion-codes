package com.recursion;

import com.recursion.extended.Parenthesis;
import com.recursion.ibh.*;
import com.recursion.inout.Letter;
import com.recursion.inout.Permutation;
import com.recursion.inout.Subset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        System.out.println(" =*=*=*=*= IBH Method =*=*=*=*= ");
        PrintNumber printNumber = new PrintNumber();
        System.out.println("=== Print Number ====");
        printNumber.print(10);
        System.out.println("=== Print Reverse Number ====");
        printNumber.printRev(10);

        System.out.println("=== Sort An Array ===");
        Sort sort = new Sort();
        List<Integer> arr = new ArrayList<>(Arrays.asList(4, 2, 1, 7, 8, 3));
        sort.sort(arr);
        System.out.println(arr);

        System.out.println(" === Sort An Stack === ");
        StackOperation stackOperation = new StackOperation();
        Stack<Integer> stack = new Stack<>();
        stack.add(4);
        stack.add(3);
        stack.add(10);
        stack.add(1);
        stack.add(5);
        stackOperation.sort(stack);
        System.out.println(stack);

        System.out.println(" === Delete Middle from Stack === ");
        int k = (stack.size() / 2) + 1;
        stackOperation.deleteMiddle(stack, k);
        System.out.println(stack);

        System.out.println(" === Reverse a Stack === ");
        stackOperation.reverse(stack);
        System.out.println(stack);

        System.out.println(" === Kth Symbol in Grammar === ");
        LeetCodeSolution solution = new LeetCodeSolution();
        System.out.println(solution.generate(4, 6));
        System.out.println(solution.generate(4, 3));

        System.out.println(" === Multiply a Array === ");
        Multiply multiply = new Multiply();
        System.out.println(multiply.mul(arr, arr.size()));

        System.out.println(" === Tower Of Honoi === ");
        TowerOfHonoi towerOfHonoi = new TowerOfHonoi();
        towerOfHonoi.printSteps(3, 1, 2, 3);
        System.out.println(" =*=*=*=*= IBH Method =*=*=*=*= ");
        System.out.println();
        System.out.println(" =*=*=*=*= Input Output Method With Recursive Tree =*=*=*=*= ");
        System.out.println(" === Subset Problem ===");
        Subset subset = new Subset();
        subset.printSubset("ab", "");
        System.out.println(" === Unique Subset Problem (Print PowerSet Or All Subsequence of String ===");
        subset.printUniqueSubset("aab", "");
        System.out.println();
        System.out.println(" === Permutation With Spaces ===");
        Permutation permutation = new Permutation();
        permutation.printPermutationWithSpaces("ABC", "");
        System.out.println(" === Permutation With Case Changes ===");
        permutation.printPermutationWithChange("abc", "");
        System.out.println(" === Letter Case Change === ");
        Letter letter = new Letter();
        letter.printLetterCaseChange("A1B2c3");
        System.out.println(" =*=*=*=*= Input Output Method With Recursive Tree =*=*=*=*= ");
        System.out.println();
        System.out.println(" =*=*=*=*= Extended Input Output Method With Recursive Tree =*=*=*=*= ");
        System.out.println(" === Generate Balance Parenthesis === ");
        Parenthesis parenthesis = new Parenthesis();
        System.out.println(parenthesis.getBalanceParenthesis(3));
    }
}
