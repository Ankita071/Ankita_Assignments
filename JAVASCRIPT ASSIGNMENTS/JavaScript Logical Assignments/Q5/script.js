let year = prompt("Enter a year to find out the next 20 leap years: ");

function leapYear(year) {
  var counter = 20;
  year++;
  while (counter > 0) {
    if ((year % 4 === 0 && year % 100 !== 0) || year % 400 === 0) {
      console.log(year);
      document.write(year + "<br />");
      counter--;
   }
   year++;
  }
}

leapYear(year);
