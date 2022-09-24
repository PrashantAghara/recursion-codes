export const printLetterCaseChange = (inp) => {
  let out = "";
  const arr = [];
  generate(inp, out, arr);
  console.log(arr);
};

const generate = (inp, out, arr) => {
  if (inp.length == 0) {
    arr.push(out);
    return;
  }
  if (isDigit(inp[0])) {
    let out1 = out;
    out1 = out1 + inp[0];
    inp = inp.substring(1);
    generate(inp, out1, arr);
  } else {
    let out1 = out;
    let out2 = out;
    out1 = out1 + inp[0].toUpperCase();
    out2 = out2 + inp[0].toLowerCase();
    inp = inp.substring(1);
    generate(inp, out1, arr);
    generate(inp, out2, arr);
  }
};

const isDigit = (x) => {
  return !isNaN(x - parseInt(x));
};
