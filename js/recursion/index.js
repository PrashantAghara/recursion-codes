import { print, printRev } from "./ibh/printNumber.js";
import { sort } from "./ibh/Sort.js";
import { printSteps } from "./ibh/towerOfHonoi.js";
import { multiply } from "./ibh/multipy.js";
import { generateGrammar } from "./ibh/kthSymbol.js";
import Stack from "./datastructure/Stack.js";
import { deleteMiddle, reverse, sortStack } from "./ibh/stackOperation.js";
import { getAlivePosition } from "./ibh/josephus.js";
import { printSubset } from "./inout/subset.js";
import { printLetterCaseChange } from "./inout/letter.js";
import {
  printPermutationWithChange,
  printPermutationWithSpaces,
} from "./inout/permutation.js";
import { getBalanceParenthesis } from "./extended/paranthesis.js";
import { generateNDigitBinaryNumber } from "./extended/binaryNumber.js";

console.log(" =*=*=*=*= IBH Method =*=*=*=*= ");
console.log("=== Print Number ====");
print(10);
console.log("=== Print Reverse Number ====");
printRev(10);
console.log("=== Sort an Array ===");
let arr = [4, 2, 1, 5, 3];
sort(arr);
console.log(arr);
console.log("=== Tower Of Honoi ===");
printSteps(3, 1, 2, 3);
console.log("=== Multiply an Array ===");
console.log(multiply(arr, arr.length));
console.log("=== Kth Symbol in Grammar ===");
console.log(generateGrammar(4, 6));
console.log("=== Sort a Stack ===");
let stack = new Stack();
stack.push(2);
stack.push(3);
stack.push(5);
stack.push(4);
stack.push(1);
sortStack(stack);
stack.printStack();
console.log("=== Reverse a Stack ===");
reverse(stack);
stack.printStack();
console.log("=== Remove Middle Element from Stack ===");
let k = Math.floor(stack.size() / 2 + 1);
deleteMiddle(stack, k);
stack.printStack();
console.log("=== Josephus Problem ===");
console.log(getAlivePosition(40, 7));
console.log(" =*=*=*=*= IBH Method =*=*=*=*= ");
console.log();
console.log(" =*=*=*=*= Input Output Method With Recursive Tree =*=*=*=*= ");
console.log(" === Subset Problem ===");
printSubset("ab", "");
console.log(" === Permutation With Spaces ===");
printPermutationWithSpaces("ABC", "");
console.log(" === Permutation With Case Changes ===");
printPermutationWithChange("abc", "");
console.log(" === Letter Case Change === ");
printLetterCaseChange("A1B2c3");
console.log(" =*=*=*=*= Input Output Method With Recursive Tree =*=*=*=*= ");
console.log();
console.log(
  " =*=*=*=*= Extended Input Output Method With Recursive Tree =*=*=*=*= "
);
console.log(" === Generate Balance Parenthesis === ");
getBalanceParenthesis(3);
console.log(" === N Digit Binary Numbers with #1s >= #0s");
generateNDigitBinaryNumber(3, "", 0, 0);
console.log(
  " =*=*=*=*= Extended Input Output Method With Recursive Tree =*=*=*=*= "
);
