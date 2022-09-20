const insert = (stack, temp) => {
  if (stack.size() == 0 || stack.peek() <= temp) {
    stack.push(temp);
    return;
  }
  let val = stack.pop();
  insert(stack, temp);
  stack.push(val);
};

export const sortStack = (stack) => {
  if (stack.size() == 1) {
    return;
  }
  let temp = stack.pop();
  sortStack(stack);
  insert(stack, temp);
};

const insertRev = (stack, temp) => {
  if (stack.isEmpty()) {
    stack.push(temp);
    return;
  }
  let val = stack.pop();
  insertRev(stack, temp);
  stack.push(val);
};

export const reverse = (stack) => {
  if (stack.size() == 1) {
    return;
  }
  let temp = stack.pop();
  reverse(stack);
  insertRev(stack, temp);
};

export const deleteMiddle = (stack, k) => {
  if (k == 1) {
    stack.pop();
    return;
  }
  let temp = stack.pop();
  deleteMiddle(stack, k - 1);
  stack.push(temp);
};
