let names = ['Tom', 'Ivan', 'Jerry'];
let myArr: any = [];

const myFun = (arr: any) => {
  for (let i of arr) {
    let myObj = { name: i, length: i.length };
    myArr.push(myObj);
  }
  console.log(myArr);
};

myFun(names);