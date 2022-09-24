export const printPermutationWithSpaces = (inp, out) => {
  if (inp.length == 0) {
    console.log(out);
    return;
  }
  let op1 = out;
  let op2 = out;
  op1 = op1 + inp.charAt(0);
  op2 = op2 + " " + inp.charAt(0);
  inp = inp.substring(1);
  printPermutationWithSpaces(inp, op1);
  printPermutationWithSpaces(inp, op2);
};

export const printPermutationWithChange = (inp, out) => {
  if (inp.length == 0) {
    console.log(out);
    return;
  }
  let op1 = out;
  let op2 = out;
  op1 = op1 + inp.charAt(0);
  op2 = op2 + inp.charAt(0).toUpperCase();
  inp = inp.substring(1);
  printPermutationWithSpaces(inp, op1);
  printPermutationWithSpaces(inp, op2);
};
