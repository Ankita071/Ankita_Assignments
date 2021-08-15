"use strict";
let x = 2;
let y = 5;
const p1 = new Promise(function (resolve, reject) {
    resolve(x);
});
const p2 = new Promise(function (resolve, reject) {
    resolve(y);
});
Promise.all([p1, p2]).then((num) => {
    let sum = 0;
    for (let n of num) {
        sum += n;
    }
    console.log(sum);
});
