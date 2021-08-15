"use strict";
var Order = {
    id: 101,
    title: "xyz",
    price: 30,
    printOrder: function () {
        console.log(this.id + " " + this.title + " " + this.price);
    },
    getPrice: function () {
        console.log("Price is: " + this.price);
    }
};
Order.printOrder();
Order.getPrice();
var copyOrder = Object.assign(Order);
copyOrder.printOrder();
copyOrder.getPrice();
