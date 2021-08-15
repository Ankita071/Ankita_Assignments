let lowNumber = 10;
function armstrong() {
  for (let i = lowNumber; i > 0; i++) {
    let numberOfDigits = i.toString().length;

    let sum = 0;

    let temp = i.toString();

    for (let char of temp) {
      sum += Math.pow(parseInt(char), numberOfDigits);
    }
    if (sum == i) {
      console.log(i);
      lowNumber = i;
      break;
   }
   if(i > 1000) {
      throw console.error("Error");
   }
  }
}

function getNextArmstrong() {
  lowNumber++;
  armstrong();
}

function resetArmstrong() {
  lowNumber = 10;
}

armstrong();
getNextArmstrong();
getNextArmstrong();

console.log("Resetting Armstrong Numbers");

resetArmstrong();

armstrong();
getNextArmstrong();
getNextArmstrong();
getNextArmstrong();
