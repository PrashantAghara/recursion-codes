export const printSteps = (n, source, helper, dest) => {
  if (n == 1) {
    console.log(`${n} plate from ${source} to ${dest}`);
    return;
  }
  printSteps(n - 1, source, dest, helper);
  console.log(`${n} plate from ${source} to ${dest}`);
  printSteps(n - 1, helper, source, dest);
};
