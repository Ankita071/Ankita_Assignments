class Rectangle {
   constructor(width, height) {
      this.width = width;
      this.height = height;
   }
   
   print() {
      document.write("Width is:" + this.width + " and height is: " + this.height + "<br />");
   }
}

var rectangle1 = new Rectangle(10, 20);
rectangle1.print();

var rectangle2 = new Rectangle(80, 50);
rectangle2.print();