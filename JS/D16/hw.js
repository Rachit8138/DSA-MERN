// Qs1. Write a JavaScript program to get the first n elements of an array. [n can be any
//     positive number].
//     For example: for array [7, 9, 0, -2] and n=3
//     Print, [7, 9, 0]
let array = [7, 9, 0, -2];
n=3;
console.log(array.splice(0,n));
//     Qs2. Write a JavaScript program to get the last n elements of an array. [n can be any
//     positive number].
//     For example: for array [7, 9, 0, -2] and n=3
//     Print, [9, 0, -2]
console.log(array.splice(array.length-n));
//     Qs3. Write a JavaScript program to check whether a string is blank or not.
let str=prompt("please enter a string");
if (str.lenth==0){
    if (str.length==0){
        console.log("string is empty");
    }else{
        console.log("string is not empty");
    }
}
//     Qs4. Write a JavaScript program to test whether the character at the given (character)
//     index is lower case.
    
//     Qs5. Write a JavaScript program to strip leading and trailing spaces from a string.
    
//     Qs6. Write a JavaScript program to check if an element exists in an array or not.
