class Stack {
  constructor() {
    this.item = [];
  }

  push = (n) => {
    this.item.push(n);
  };

  pop = () => {
    return this.item.pop();
  };

  peek = () => {
    return this.item[this.item.length - 1];
  };

  size = () => {
    return this.item.length;
  };

  isEmpty = () => {
    return this.item.length === 0;
  };

  printStack = () => {
    console.log(this.item);
  };
}

export default Stack;
