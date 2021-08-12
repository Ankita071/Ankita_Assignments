function concatArr() {
   let arr1 = ["a" , "b", "c"];
   console.log("First array is: [" + arr1 + "]");
   document.write("First array is: [" + arr1 + "]<br />");
   let arr2 = [1, 2, 3];
   console.log("Second array is: [" + arr2 + "]");
   document.write("Second array is: [" + arr2 + "]<br />");

   let arr3 = arr1.concat(arr2);

   console.log("Concating 1st array with 2nd array: [" + arr3 + "]");
   document.write("Concating 1st array with 2nd array: [" + arr3 + "]<br />");
}

concatArr();