// JS (Part 6)
// Qs1. Write a JavaScript function that returns array elements larger than a number.
let arr = [8, 9, 10, 1, 2, 3, 4, 5, 6, 7];
let num = 5;

function larger(arr, num) {
    for (i = 0; i < arr.length; i++) {
        if (arr[i] > num) {
            console.log(arr[i]);
        }
    }
}

larger(arr, num)
// Qs2. Write a JavaScript function to extract unique characters from a string.
// Example: str = “abcdabcdefgggh” ans = “abcdefgh”
let str = "abcdabcdefgggh";

//function to get String with all unique elements
/* function getUnique(str) {
    ans = "";
    for (i=0;i<=str.length;i++){
        if (ans.indexOf(str[i])==-1){
            ans+=str[i];
        }
    }
    console.log(ans);
} */

function getUnique(str) {
    ans = '';
    for (a of str) {
        if (ans.indexOf(a) == -1) {
            ans += a;
        }
    }
    console.log(ans);
}
getUnique(str);
// Qs3. Write a JavaScript function that accepts a list of country names as input and
// returns the longest country name as output.
// Example : country = ["Australia", "Germany", "United States of America"] output :

// "United States of America"

let country = ["Australia", "Germany", "United States of America"]

function size(country) {
    let largest = '';
    for (str of country) {
        if (largest.length < str.length) {
            largest = str;
        }
    }
    console.log(largest);
}

size(country);
// Qs4. Write a JavaScript function to count the number of vowels in a String
// argument.
function vowel(str) {
    let count = 0;
    let list = ['a', 'e', 'i', 'o', 'u'];
    for (x of str) {
        // if (list.indexOf(x)==0){ // this will check only if present in index 0  
        if (list.indexOf(x) != -1) {
            console.log(x);
            count++;
        }
    }
    console.log(count);
}

vowel('australia')

// Qs5. Write a JavaScript function to generate a random number within a range
// (start, end).
function generator(start, end){
    diff=end - start;
    console.log(Math.floor(Math.random()*diff)+start);
}
generator(100,200)
