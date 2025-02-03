/* 
let a =10; 
let b=5; 
console.log("sum is:",a+b);
// this is comment  

*/

/* let pencilPrice=10;
let eraserPrice= 20; 
console.log(" total price: ", pencilPrice + eraserPrice, "only");

let output=`The total price is : ${pencilPrice + eraserPrice} only`; 
console.log(output); */

/* ${} // back ticks */

// question no 1
let a = 10;
if(a%10==0){
    console.log("good");
}else{
    console.log("bad");
}

// question no 2
let name=prompt("enter your name: ");
let age= prompt("enter your age: ");
alert(`${name} is ${age} years old`);
// question no 3
let m=2

switch(m){
        case 1: console.log("jan, feb, mar"); 
        break; 
        case 2: console.log("april, may, jun");
        break;
        case 3: console.log("july, aug, sep");
        break;
        case 4: console.log("oct, nov, dec");
        break;
        default: console.log("invalid");
}

// question no 4
let char="applef"

if ((char[0]=='a' || char[0]=='A') && char.length>5){
    console.log("golden String");
    }else{
    console.log("not")
}

// question no 5&6 are very easy 

let pencilPrice = 10;
let eraserPrice = 5;

console.log(`The total price is ${pencilPrice + eraserPrice}`);

