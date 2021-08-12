let longestWord = prompt("Enter a string:", "ababcdababefgababhiab");
console.log("String is: " + longestWord);
document.write("String is: " + longestWord + "<br>");
function token(longestWord) {
  let charToken = longestWord.split("");
  let a = [];

  for (let i = 0; i < charToken.length; i++) {
    if (charToken[i] == "a" || charToken[i] == "b") {
      a[i] = " ";
    } else {
      a[i] = charToken[i];
    }
  }

  let b = a.join("");
  let c = b.split(" ");
  let maxLength = 0;

  for (let index = 0; index < c.length; index++) {
    if (c[index].length > maxLength) {
      maxLength = c[index].length;
      var len = index;
    }
  }

  if (c[len] === undefined) {
    return " \"\" ";
  } else {
    return c[len];
  }
}

console.log("Longest token in string is: " + token(longestWord));
document.write("Longest token in string is: " + token(longestWord) + "<br>");
