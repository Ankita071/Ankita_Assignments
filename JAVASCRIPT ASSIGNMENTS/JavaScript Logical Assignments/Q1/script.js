function sum() {
var num = window.prompt("Enter a number");
var sum = 0;

for (let i = 1; i <= num; i++) {
   sum += i;
}
console.log("Sum of numbers from 1 to " + num + " is: " + sum);
document.write("Sum of numbers from 1 to " + num + " is: " + sum);
}

sum();