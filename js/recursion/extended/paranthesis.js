const generate = (open, close, out) => {
  if (open === 0 && close === 0) {
    console.log(out);
    return;
  }
  if (open !== 0) {
    let out1 = out;
    out1 = out1 + "(";
    generate(open - 1, close, out1);
  }
  if (close > open) {
    let out1 = out;
    out1 = out1 + ")";
    generate(open, close - 1, out1);
  }
};

export const getBalanceParenthesis = (n) => {
  generate(n, n, "");
};
