// JS (P art 8)
// Practice Questions

// Qs1. Square and sum the array elements using the arrow function and then find the
// average of the array.
let nums=[1,2,3,4,5];
console.log(nums.map(el=>{
    return el*el
}));

let sum=nums.reduce((sum,el)=>sum+el);
console.log(sum);

console.log("average: ", sum/nums.length);

// Qs2. Create a new array using the map function whose each element is equal to the
// original element plus 5.
console.log(nums.map(el=>{
    return el+5;
}));

// Qs3. Create a new array whose elements are in uppercase of words present in the
// original array.
let string=['rachit', 'prashna', 'jebisha'];
console.log(string.map((el)=>el.toUpperCase()));

// Qs4. Write a function called doubleAndReturnArgs which accepts an array and a
// variable number of arguments. The function should return a new array with the original
// array values and all of the additional arguments doubled.

const doubleAndReturnArgs=(arr, ...args)=>{

    console.log(...arr, ...args.map((el)=>{
        return el*2
    }));
}

doubleAndReturnArgs([1,2,3],14,2);

// Qs5. Write a function called mergeObjects that accepts two objects and returns a new
// object which contains all the keys and values of the first object and second object.