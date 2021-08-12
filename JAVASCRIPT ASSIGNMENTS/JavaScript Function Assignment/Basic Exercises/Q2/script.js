const square = function (x) {
  return x * x;
};

const double = function (x) {
  return 2 * x;
};

const compose = function (f1, f2) {
  const v = function (value) {
    return f1(f2(value));
  };
  return v;
};

var f1 = compose(square, double);
document.write(f1(5) + "<br />");
document.write(f1(10) + "<br />");

var f2 = compose(double, square);
document.write(f2(5) + "<br />");
document.write(f2(10) + "<br />");
