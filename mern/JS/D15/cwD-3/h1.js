let name="rohit"
name[0]='m'
console.log(name) // rohit this is the example to show string ar immutable
name='mohit'
console.log(name)

let fruits=["mango","apple", "litchi"]// array 
fruits[0]="banana"
console.log(fruits) // ["banana","apple", "litchi"]
// this is the example of mutable for arrays 


// Strings: Immutable
// A string's value cannot be changed once it is created. Any operation that appears to modify a string actually creates a new string.
let str = "Hello";
str[0] = "J"; // Attempting to modify a character
console.log(str); // Output: "Hello" (unchanged)

// Using string methods
let newStr = str.replace("H", "J"); // Creates a new string
console.log(newStr); // Output: "Jello"
console.log(str); // Output: "Hello" (original string remains unchanged)

// Arrays: Mutable
// Arrays in JavaScript are objects and can be modified directly without creating a new instance. You can change, add, or remove elements within the array.


let arr = [1, 2, 3];
arr[0] = 10; // Modifying an element
console.log(arr); // Output: [10, 2, 3]

arr.push(4); // Adding a new element
console.log(arr); // Output: [10, 2, 3, 4]

arr.pop(); // Removing the last element
console.log(arr); // Output: [10, 2, 3]
/* Key Difference:
Strings (Immutable): Cannot be changed. Any operation creates a new string.
Arrays (Mutable): Can be directly modified without creating a new array. */

/* 
// Reassigning a variable (name = "mohit") works because it creates a new string and points the variable to it. you cannot use the function to change the value of string. but you can do that in array using push function 
*/

