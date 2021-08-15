"use strict";
//a
var add = function (a, b) {
    if (a === void 0) { a = 2; }
    if (b === void 0) { b = 5; }
    return a + b;
};
console.log(add());
//b
var userFriends = function (username) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    console.log("Username= " + username + ", friends= [" + friends + "]");
};
userFriends("An", "A", "Vi");
//c
var printCapitalNames = function (a, b, c, d, e) {
    console.log(a.toUpperCase());
    console.log(b.toUpperCase());
    console.log(c.toUpperCase());
    console.log(d.toUpperCase());
    console.log(e.toUpperCase());
};
var names = ["An", "Vi", "A", "V", "Ri"];
printCapitalNames.apply(void 0, names);
