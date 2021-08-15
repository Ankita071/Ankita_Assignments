interface Printable {
   print: () => string;
 }
 
 let circle: Printable = {
   print: (): string => {
     return "This is a circle object";
   },
 };
 
 let employee: Printable = {
   print: (): string => {
     return "This is an employee object";
   },
 };
 
 function printAll(circle: Printable, employee: Printable) {
   console.log(circle.print());
   console.log(employee.print());
 }
 
 printAll(circle, employee);