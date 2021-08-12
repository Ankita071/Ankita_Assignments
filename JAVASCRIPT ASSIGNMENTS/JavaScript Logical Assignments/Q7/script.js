function currency() {
   let val = document.getElementById("curr").value;
   document.getElementById("ind").innerHTML = "In Indian rupees = " + (val * 74.28) + " INR";
   document.getElementById("jap").innerHTML = "In Japanese Yen = " + (val * 109.14) + " Japanese Yen";
   document.getElementById("eur").innerHTML = "In Euro = " + (val * 0.84) + " Euro";
   document.getElementById("pound").innerHTML = "In Pound Sterling = " + (val * 0.72) + " Pound Sterling";
}
