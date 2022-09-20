const insert = (arr, temp) => {
  if (arr.length == 0 || arr[arr.length - 1] <= temp) {
    arr.push(temp);
    return;
  }
  let temp1 = arr[arr.length - 1];
  arr.pop();
  insert(arr, temp);
  arr.push(temp1);
};

export const sort = (arr) => {
  if (arr.length == 1) {
    return;
  }
  let temp = arr[arr.length - 1];
  arr.pop();
  sort(arr);
  insert(arr, temp);
};
