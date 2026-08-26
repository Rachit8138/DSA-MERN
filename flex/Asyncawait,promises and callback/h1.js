console.log("one");
console.log("two");

setTimeout(() => {
  console.log("hello");
}, 4000); //timeout

console.log("three");
console.log("four");
/* ----------------------callbacks ------------------- */
function sum(a, b) {
    console.log(a + b);
}

function calculator(a, b, callback) {
    callback(a, b);
}

calculator(1, 2, sum);
// calculator(1, 2, sum)
//           ↓
// callback = sum
//           ↓
// callback(1, 2)
//           ↓
// sum(1, 2)
//           ↓
// 3


// sum = callback function

// callback = parameter that receives sum

// callback(1, 2) = calling the callback

/*----------------------------
can also be written as 
calculator(a,b,(a,b)=>{
    console.log(a+b);
    })
*/

// set timeout also take callback 
const hello=()=>{
    console.log("hello world ");
}

setTimeout(hello,3000);
