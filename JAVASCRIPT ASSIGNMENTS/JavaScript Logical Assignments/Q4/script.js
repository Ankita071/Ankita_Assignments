function headsRatio(flips) {
   let heads = Math.random() * 10;

   let ratio = heads / flips;
   return ratio;
}
let flips = prompt("Enter the number of flips: ");

document.write("Fraction of heads is: " + headsRatio(flips));