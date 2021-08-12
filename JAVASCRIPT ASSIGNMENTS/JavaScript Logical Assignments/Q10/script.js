function fibonacci() {
   let num = [];
   num[0] = 1;
   num[1] = 1;
   for (let i = 2; i < 100; i++) {
      num[i] = num[i-1] + num[i-2];
   }
   console.log("List of first 100 Fibonacci numbers is: [" + num + "]");
   document.write("List of first 100 Fibonacci numbers is: [" + num + "]");
}

fibonacci();