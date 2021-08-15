//a
var add = (a = 2, b = 5) => a+b;
console.log(add());

//b
const userFriends = function (username:any, ...friends:any) {
   console.log("Username= " + username + ", friends= [" + friends + "]");
};

userFriends("An", "A", "Vi");

//c
const printCapitalNames = function (a:any, b:string, c:string, d:any, e:string) {
   console.log(a.toUpperCase());
   console.log(b.toUpperCase());
   console.log(c.toUpperCase());
   console.log(d.toUpperCase());
   console.log(e.toUpperCase());
}

const names:[any, string, string, any, string] = ["An", "Vi", "A", "V", "Ri"];
printCapitalNames(...names);