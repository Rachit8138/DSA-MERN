/* JS part7 */

// qs1. write an arrow function named arrayAverage that accepts an array of numbers and returns the average of those numbers.
const arrayAverage = (arr)=>{
    let total=0;
    for (let number of arr){
        total +=number;
    }
    return total/arr.length;
};
let arr =[1,2,3,4,5,6];
console.log(arrayAverage(arr));
// qs2. write an arrow function anamed isEven() that takes a single number as argument and returns if it is even or not. 
let num=4;
const isEven=(num)=>num%2 ==0;
// qs3. what is the output of the follwoing code. 
const object ={
    message:'Hello, World!',

    logMessage(){
        console.log(this.message);
    }
};
setTimeout(object.logMessage,1000);

/* 
After a delay of 1 second, undefined is logged to the console.

While the setTimeout() function uses the object. logMessage as a callback, still, it
invokes object.logMessage as a regular function, rather than a method.

And during a regular function invocation this equals the global object, which is a
window in the case of the browser environment.

That's why console.log(this.message) inside logMessage method logs
window.message, which is undefined.
*/

// qs4. what is the output of the follwoing code. 
let length =4;
function callback(){
    console.log(this.length);
}

const obj ={
    length:5,
    method(callback){
        callback();
    },
};

obj.method(callback,1,2);

/* 
'Hello, World!' is logged to the console.
object. getMessage) is a method invocation, that's why this inside the method equals
object.
There's also a variable declaration const message = 'Hello, Earth!' inside the method.
The variable doesn't influence the value of this.message.
*/

// Write a function that prints 'hello world ' 5 times at intervals of 2s 


let id = setInterval(() => {// call back
    console.log("Hello World");
}, 2000);// 2s

setTimeout(() => {
    clearInterval(id);
    console.log('clear interval ran ');
},10000);