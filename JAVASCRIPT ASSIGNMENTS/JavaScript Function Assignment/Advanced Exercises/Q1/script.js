const isEven = function (num) {
   return (num % 2 == 0);
}

const find = function (arr, test) {
   if(test(arr.slice(0,1))) {
      return arr.slice(0,1);
   }
   else {
      arr.splice(0, 1);
      // arr.shift();
      return find(arr, isEven);
   }
}

document.write(isEven(3) + "<br />");
document.write(isEven(4) + "<br />");

document.write(find([1, 3, 5, 4, 2], isEven));