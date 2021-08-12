function parity(num) {
   if (num % 2 == 0) {
      return "Even";
   }
   else {
      return "Odd";
   }
}

var num = prompt("Enter a number:");

console.log(num + " is " + parity(num));
document.write(num + " is " + parity(num));