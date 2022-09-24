const addSubset = (inp, out) => {
  if (inp.length == 0) {
    console.log(out);
    return;
  }
  let out1 = out;
  out1 = out1 + inp.charAt(0);
  inp = inp.substring(1);
  addSubset(inp, out);
  addSubset(inp, out);
};

export const printSubset = (inp, out) => {
  addSubset(inp, out);
};
