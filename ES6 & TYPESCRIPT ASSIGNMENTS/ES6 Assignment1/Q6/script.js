"use strict";
var Sysnet = {
    laptop_model: 2001,
    desk_no: 2,
    name: "A",
    laptopIssue: function () {
        console.log("Hey! I am " + this.name + ". My laptop model number is " + this.laptop_model + ", and desk number is " + this.desk_no + " and I am not able to open the laptop.");
    }
};
Sysnet.laptopIssue();
