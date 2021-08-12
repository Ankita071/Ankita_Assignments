function bubbleSort() {
  let arr = [];

  for (let i = 0; i < 20; i++) {
    arr[i] = Math.round(Math.random() * 10, 1);
  }
  console.log("20 random numbers are: [" + arr + "]");
  document.write("20 random numbers are: [" + arr + "]" + "<br />");
  let temp = 0;

  for (let index = 0; index < arr.length; index++) {
   for(var j = 0; j < ( arr.length - index -1 ); j++){
      if(arr[j] > arr[j+1]){
        temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j+1] = temp;
      }
    }
  }
  console.log("Numbers sorted using bubble sort are: [" + arr + "]");
  document.write("Numbers sorted using bubble sort are: [" + arr + "]" + "<br />");
}

bubbleSort();
