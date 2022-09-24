export const multiply = (arr, size) => {
  if (size == 1) {
    return arr[0];
  }
  let temp = arr[size - 1];
  let ans = multiply(arr, size - 1);
  return ans * temp;
};
