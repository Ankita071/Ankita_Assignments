function sum() {
   var n = 17;
   var sum = 0;
   
   for(let i = 1; i <= n; i++) {
      if ((i % 3 == 0) || (i % 5 == 0)) {
         sum += i;
      }
   }

   console.log("Sum of numbers from 1 to " + n + " which are multiple of 3 or 5 is: " + sum);
   document.write("Sum of numbers from 1 to " + n + " which are multiple of 3 or 5 is: " + sum);
}

sum();