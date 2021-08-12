const map = function(arr, func) {
   a = [];
   for (const i of arr) {
      a.push(func(i))
   }
   return a;
}

const square = function (i) {
   return i * i;
}

document.write("[" + map([1, 2, 3, 4, 5], square) + "]<br />");
document.write("[" + map([1, 4, 9, 16, 25], Math.sqrt) + "]<br />");