function translate(sentence) {
   console.log("The sentence in English is: " + sentence);
   document.write("The sentence in English is: " + sentence + "<br />");
   let word = sentence.toLowerCase().split(" ");
   let firstChar;
   let otherChar;
   for (let i = 0; i < word.length; i++) {
      firstChar = word[i].charAt(0);
      otherChar = word[i].substring(1);
      word[i] = otherChar + firstChar + "ay";
   }
   let w = word.join(" ");
   console.log("The translated sentence from English to Pig Latin is: " + w);
   document.write("The translated sentence from English to Pig Latin is: " + w + "<br />");
}

let sentence = prompt("Enter a sentence: ", "The quick brown fox");

translate(sentence);