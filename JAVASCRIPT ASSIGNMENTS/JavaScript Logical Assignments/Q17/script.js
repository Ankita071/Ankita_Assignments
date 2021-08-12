function gcd(a, b) {
  if (b == 0) return a;
  else return gcd(b, a % b);
}

function rotateArray(arr, d) {
   console.log("Array is: [" + arr + "]");
   document.write("Array is: [" + arr + "]<br />");
  let n = arr.length;
  d = d % n;
  let g_c_d = gcd(d, n);
  for (let i = 0; i < g_c_d; i++) {
    let temp = arr[i];
    let j = i;

    while (true) {
      let k = j + d;
      if (k >= n) k = k - n;

      if (k == i) break;

      arr[j] = arr[k];
      j = k;
    }
    arr[j] = temp;
  }
  console.log("Rotated array by " + d + " is: [" + arr + "]");
  document.write("Rotated array by " + d + " is: [" + arr + "]<br />");
}
let arr = [1, 2, 3, 4, 5, 6];

rotateArray(arr, 2);
