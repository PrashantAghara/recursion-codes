export const generateNDigitBinaryNumber = (n, out, ones, zeros) => {
  if (n == 0) {
    console.log(out);
    return;
  }
  let out1 = out;
  out1 = out1 + "1";
  generateNDigitBinaryNumber(n - 1, out1, ones + 1, zeros);
  if (ones > zeros) {
    let out2 = out;
    out2 = out2 + "0";
    generateNDigitBinaryNumber(n - 1, out2, ones, zeros + 1);
  }
};
