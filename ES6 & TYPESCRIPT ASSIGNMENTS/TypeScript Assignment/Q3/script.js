"use strict";
let circle = {
    print: () => {
        return "This is a circle object";
    },
};
let employee = {
    print: () => {
        return "This is an employee object";
    },
};
function printAll(circle, employee) {
    console.log(circle.print());
    console.log(employee.print());
}
printAll(circle, employee);
