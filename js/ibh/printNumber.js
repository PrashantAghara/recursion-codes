export const print = (n) => {
  if (n == 1) {
    console.log(1);
    return;
  }
  print(n - 1);
  console.log(n);
};

export const printRev = (n) => {
  if (n == 1) {
    console.log(1);
    return;
  }
  console.log(n);
  print(n - 1);
};
