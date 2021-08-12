const square = function (x) {
   return x*x;
}

const double = function (x) {
   return 2 * x;
}

function composedValue(square, double, x) {
   return square(double(x));
}

document.write(composedValue(square, double, 5));