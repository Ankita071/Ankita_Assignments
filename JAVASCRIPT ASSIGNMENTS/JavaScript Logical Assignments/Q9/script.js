function concatArrAlternate() {
   let arr1 = ["a" , "b", "c"];
   console.log("First array is: [" + arr1 + "]");
   document.write("First array is: [" + arr1 + "]<br>");
   let arr2 = [1, 2, 3];
   console.log("Second array is: [" + arr2 + "]");
   document.write("Second array is: [" + arr2 + "]<br>");

   let arr3 = [];

   for (let index = 0; index < arr1.length + arr2.length; index++) {
      if (index % 2 === 0) {
         arr3.push(arr1[index/2]);
      } else {
         arr3.push(arr2[(index-1)/2]);
      }
   }
   console.log("Concating 1st array with 2nd array: [" + arr3 + "]");
   document.write("Concating 1st array with 2nd array: [" + arr3 + "]<br>");
}

concatArrAlternate();