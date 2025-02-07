/* JS part7 */

// qs1. write an arrow function named arrayAverage that accepts an array of numbers and returns the average of those numbers.

// qs2. write an arrow function anamed isEven() that takes a single number as argument and returns if it is even or not. 

// qs3. what is the output of the follwoing code. 
const object ={
    message:'Hello, World!',

    logMessage(){
        console.log(this.message);
    }
};
setTimeout(object.logMessage,1000);

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