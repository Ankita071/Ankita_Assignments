const map = function(arr, func) {
   if(arr.length == 1) {
      return func(arr);
   }
   else {
      return [func(arr[0])].concat(map(arr.slice(1), func));
   }
}

const square = function (i) {
   return i * i;
}

document.write("[" + map([1, 2, 3, 4, 5], square) + "]<br />");
document.write("[" + map([1, 4, 9, 16, 25], Math.sqrt) + "]<br />");