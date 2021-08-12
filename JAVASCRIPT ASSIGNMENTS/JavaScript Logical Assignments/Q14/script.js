function random() {
   let arr = [];

   for (let i = 0; i < 100; i++) {
      arr[i] = Math.round(Math.random() * 10, 1);
   }
   console.log("100 random numbers are: [" + arr + "]");
   document.write("100 random numbers are: [" + arr + "]" + "<br />");

   arr.sort(function(a,b){return a-b});

   console.log("Largest number is: " + arr[arr.length-1]);
   document.write("Largest number is: " + arr[arr.length-1] + "<br />");
   console.log("Smallest number is: " + arr[0]);
   document.write("Smallest number is: " + arr[0] + "<br />");

   let evenCount =0;
   let oddCount =0;
   let sum = 0;

   for(let j = 0; j < arr.length; j++) {
      if(arr[j] % 2 == 0) {
         evenCount++;
      }
      else {
         oddCount++;
      }

      sum += arr[j];
   }

   if(evenCount > oddCount) {
      console.log("Even count is higher than odd count");
      document.write("Even count is higher than odd count" + "<br />");
   } else {
      console.log("Odd count is higher than even count");
      document.write("Odd count is higher than even count" + "<br />");
   }

   let average = sum / arr.length;

   console.log("Sum is: " + sum + " and average is: " + average);
   document.write("Sum is: " + sum + " and average is: " + average + "<br />");
}

random();