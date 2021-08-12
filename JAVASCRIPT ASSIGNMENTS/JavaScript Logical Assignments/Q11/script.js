function reverse() {
   let arr = [23, 34,12, 97, 98, 67, 89, 32, 32, 43];
   console.log("Array of random values is: [" + arr + "]");
   document.write("Array of random values is: [" + arr + "]<br>");
   
   let reverseArr = arr.reverse();
   console.log(" Reverse of array of random values is: [" + reverseArr + "]");
   document.write(" Reverse of array of random values is: [" + reverseArr + "]<br>");
   
   let sortArr = arr.sort();
   console.log("Sorted array of random values is: [" + sortArr + "]");
   document.write("Sorted array of random values is: [" + sortArr + "]<br>");
   
   let reverseSortArr = sortArr.reverse();
   console.log("Reversed sorted array of random values is: [" + reverseSortArr + "]");
   document.write("Reversed sorted array of random values is: [" + reverseSortArr + "]<br>");
}

reverse();