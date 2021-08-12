let list = prompt("Enter the string you want to input:", "Hello World in a frame");


function rectFrame(list) {
   let word = list.split(" ");
   console.log("*********");
   document.write("*********<br />");

   for (let i = 0; i < word.length; i++) {
      console.log("* " + word[i] + " *");      
      document.write("* " + word[i] + " *<br />");      
   }

   console.log("*********");
   document.write("*********<br />");
}

rectFrame(list);