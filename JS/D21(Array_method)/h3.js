let arr=[1,2,3,4,5];
let newarr=arr;
newarr.push(7);
console.log(arr);
console.log(newarr);
/* newarr and arr are both same if you change one value then another value change huncha  */

let array=[4,5,6,7,8];
let newarray= [...array];
newarray.push(7);
console.log(array);
/* only copyting the value  */

console.log(..."hello");
// individual character is printed

// to combine both in one 
let nums = [...arr, ...array] ;
console.log(nums);
console.log(nums.sort());
console.log(nums);
// .sort() will make the new string and change the value of nums

/* ----------------------------------------------------------------------- */
/* spred with object literals */
const data={
    email:"rachitpra@gmail.com",
    password:"abcd",
};
const dataCopy={...data,id:123, country:"India"};
console.log(dataCopy);
let a=[1,2,3,4,5]; // array stores value
let obj ={... arr}// obj->key:val

console.log(obj);/* { '0': 1, '1': 2, '2': 3, '3': 4, '4': 5, '5': 7 } */
