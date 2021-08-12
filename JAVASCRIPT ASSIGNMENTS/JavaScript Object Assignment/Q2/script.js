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
   document.write("Area of " + this.width + " and " + this.height + " is:" + area + "<br />");
}

var rectangle1 = new Rectangle(10, 20);
rectangle1.print();
rectangle1.getArea();

var rectangle2 = new Rectangle(80, 50);
rectangle2.print();
rectangle2.getArea();

