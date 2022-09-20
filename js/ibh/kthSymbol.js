export const generateGrammar = (n, k) => {
  if (n == 1 && k == 1) {
    return 0;
  }
  let mid = Math.pow(2, n - 1) / 2;
  if (k <= mid) {
    return generateGrammar(n - 1, k);
  } else {
    return generateGrammar(n - 1, k - mid) ^ 1;
  }
};
