const isEven = function (num) {
   return (num % 2 == 0);
}

const find = function (arr, test) {
   let a = [];
   for (const i of arr) {
      if(isEven(i)) {
         a.push(i);
      }
   }
   return a.shift();
}

document.write(isEven(3) + "<br />");
document.write(isEven(4) + "<br />");

document.write(find([1, 3, 5, 4, 2], isEven));