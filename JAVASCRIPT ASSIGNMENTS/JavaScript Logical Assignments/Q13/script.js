function sumFor() {
   let arr = [5, 4, 10, 3, 20];
   console.log("Numbers in an array: [" + arr + "]");
   document.write("Numbers in an array: [" + arr + "]" + "<br />");
   let sum = 0;

   for (let index = 0; index < arr.length; index++) {
      sum += arr[index];
   }
   console.log("Sum using for loop is: " + sum);
   document.write("Sum using for loop is: " + sum + "<br />");
}

sumFor();

function sumWhile() {
   let arr = [7, 4, 10, 3, 20];
   console.log("Numbers in an array: [" + arr + "]");
   document.write("Numbers in an array: [" + arr + "]" + "<br />");
   let sum = 0;
   let i = 0;

   while (i < arr.length) {
      sum += arr[i];
      i++;
   }
   console.log("Sum using while loop is: " + sum);
   document.write("Sum using while loop is: " + sum + "<br />");
}

sumWhile();

function sumDoWhile() {
   let arr = [6, 4, 10, 3, 20];
   console.log("Numbers in an array: [" + arr + "]");
   document.write("Numbers in an array: [" + arr + "]" + "<br />");
   let sum = 0;
   let i = 0;

   do {
      sum += arr[i];
      i++;
   }while (i < arr.length);
   console.log("Sum using do while loop is: " + sum);
   document.write("Sum using do while loop is: " + sum + "<br />");
}

sumDoWhile();