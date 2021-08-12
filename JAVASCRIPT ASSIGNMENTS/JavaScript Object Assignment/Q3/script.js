class Rectangle {
   constructor(width, height) {
      this.width = width;
      this.height = height;
   }
   
   print() {
      document.write("Width is:" + this.width + " and height is: " + this.height + "<br />");
   }
}

Rectangle.prototype.getArea = function(width, height) {
   var area = this.width * this.height;
   document.write("Area of " + this.width + " and " + this.height + " is: " + area + "<br />");
}

var r = new Rectangle(4, 5);

// Because of difference in name of height property, the below line "r.height = 50;" will not make any change in the property's value of Rectangle class.
r.hieght = 50;
// r.print();
r.getArea();

