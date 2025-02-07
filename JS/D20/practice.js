const cube=(n) => {// this works as intitialiser
    console.log( n*n*n);  // in this type you can even perfor calculation, print and even return 
}

const pow=(a,b) =>{return a**b};// this is the more compact way of writing

/* Implicit return */
const mul =(a,b) =>a*b;// where only value is returned and no calculation or printing is made

const square=(n) => n*n; 

/* Set Timeout */
console.log("hi there");

setTimeout(()=>{
    console.log("apna college");
}, 4000);

console.log("welcome to");

/* Set Interval */

id1= setInterval( ()=>{
    console.log('Apna college');
}, 2000);

clearInterval(id)