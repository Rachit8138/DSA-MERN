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
let str='m'
    if (str.length==0){
        console.log("string is empty");
    }else{
        console.log("string is not empty");
    }
//     Qs4. Write a JavaScript program to test whether the character at the given (character)
//     index is lower case.
let st ="ApNaCoLlEgE";
let idx=3;
if (str[idx]==st[idx].toLowerCase()){
    console.log("character is lowercase");
}else{
    console.log("character is not lowercase");
}
//     Qs5. Write a JavaScript program to strip leading and trailing spaces from a string.
let m="sfdsgsdg s sdfe";
console.log(`original string : ${m}`);
console.log(`string without space :${m.trim()}`);
//     Qs6. Write a JavaScript program to check if an element exists in an array or not.
let box=["hello",'a', 23, 64,-6];
let item=89;
if(box.indexOf(item)!= -1){
    console.log("element exists in array");
} else {
    console.log("element doesn't exist in array");
}