// a
let arr = ["Hey", "Hi", "Hello", "Hy"];

let [,, c,] = arr;

console.log(c);

// b
let organisation = {
   oName: "Capgemini",
   address: {
      city: "Bangalore",
      state: "Karnataka",
      pinCode: 111111
   }
};

let {oName, address} = organisation;

let {city, state, pinCode} = address;

console.log(pinCode);

