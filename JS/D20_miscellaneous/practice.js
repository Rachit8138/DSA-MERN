const cube=(n) => {console.log( n*n*n)};// this works as intitialiser
      // in this type you can even perfor calculation, print and even return 


const pow=(a,b) =>{return a**b};// this is the more compact way of writing

/* Implicit return */
const mul =(a,b) =>a*b;// where only value is returned and no calculation or printing is made

const square=(n) => n*n; 

/* Set Timeout */
console.log("hi there");

setTimeout(()=>{
    console.log("apna college");
}, 100);

console.log("welcome to");
console.log('even and out');
console.log('even and out');console.log('even and out');console.log('even and out');console.log('even and out');console.log('even and out');
/* Set Interval */

id1= setInterval( ()=>{
    console.log('Apna college');
}, 2000);

clearInterval(id1)

/* this with arrow function */
const student={
    name: "aman",
    marks:95,
    prop:this,  // global scope
    getName: function() {   // normal function is used here
        console.log(this);  /// will give you window
        return this.name;
    }, 

    /* down one is not important at all */
    getMarks:()=> {   // arrow function used
        console.log(this); // parent's scope ->window obj
        return this.marks;
    }, 
// arrow function ko lagi this will not be calling obj
// this will mean parent scope 

/* new one */
getInfo1: function(){
    setTimeout(() =>{
        console.log(this);  // student 
    }, 2000);
}, 
getInfo2: function(){
    setTimeout(() =>{
        console.log(this);  // windown
    }, 2000);
}, 


};
