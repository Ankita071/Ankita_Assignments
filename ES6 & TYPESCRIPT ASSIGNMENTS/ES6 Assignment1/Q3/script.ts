let Order = {
   id: 101,
   title: "xyz",
   price: 30,
   printOrder() {
      console.log(this.id + " " + this.title + " " + this.price);
   },
   getPrice() {
      console.log("Price is: " + this.price);
   }
};

Order.printOrder();
Order.getPrice();

let copyOrder = Object.assign(Order);
copyOrder.printOrder();
copyOrder.getPrice();