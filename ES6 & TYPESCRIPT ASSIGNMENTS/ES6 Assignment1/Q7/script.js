"use strict";
// a
var arr = ["Hey", "Hi", "Hello", "Hy"];
var c = arr[2];
console.log(c);
// b
var organisation = {
    oName: "Capgemini",
    address: {
        city: "Bangalore",
        state: "Karnataka",
        pinCode: 111111
    }
};
var oName = organisation.oName, address = organisation.address;
var city = address.city, state = address.state, pinCode = address.pinCode;
console.log(pinCode);
