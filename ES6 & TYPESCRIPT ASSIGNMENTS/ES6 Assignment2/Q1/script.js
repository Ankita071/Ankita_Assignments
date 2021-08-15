"use strict";
class Fib {
    constructor() {
        this.fibonacci = {
            [Symbol.iterator]() {
                let n1 = 0, n2 = 1, value;
                return {
                    next() {
                        value = n1 + n2;
                        n1 = n2;
                        n2 = value;
                        return { value };
                    },
                };
            },
        };
    }
}
var fib_series = new Fib();
for (const num of fib_series.fibonacci) {
    if (num > 6)
        break;
    console.log(num);
}
