const getPosition = (arr, k, index) => {
  if (arr.length == 1) {
    return arr[0];
  }
  index = (index + k) % arr.length;
  arr.splice(index, 1);
  return getPosition(arr, k, index);
};

export const getAlivePosition = (n, k) => {
  const arr = [];
  for (let i = 1; i <= n; i++) {
    arr.push(i);
  }
  return getPosition(arr, k - 1, 0);
};
