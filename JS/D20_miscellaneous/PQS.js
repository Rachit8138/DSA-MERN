// practice Qs
// Write an arrow function that returns the square of a number 'n'.replace
const square =(n)=>n*n;

console.log(square(4));

// Write a function that prints 'hello world ' 5 times at intervals of 2s 


let id = setInterval(() => {// call back
    console.log("Hello World");
}, 2000);// 2s

setTimeout(() => {
    clearInterval(id);
    console.log('clear interval ran ');
},10000);

/* chatgpt way  */

let count = 0;
let id_ = setInterval(() => {
    console.log("Hello World");
    count++;
    if (count === 5) {
        clearInterval(id_);
        console.log('clear interval ran');
    }
}, 2000);

// both are correct way doing this program 