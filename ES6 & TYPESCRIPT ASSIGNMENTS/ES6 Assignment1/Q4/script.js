"use strict";
var names = ['Tom', 'Ivan', 'Jerry'];
var myArr = [];
var myFun = function (arr) {
    for (var _i = 0, arr_1 = arr; _i < arr_1.length; _i++) {
        var i = arr_1[_i];
        var myObj = { name: i, length: i.length };
        myArr.push(myObj);
    }
    console.log(myArr);
};
myFun(names);
