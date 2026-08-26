function myfunction() {
    console.log("Hello, World!");
}

myfunction();

function mul(a,b){
    return a*b;
}

const arrowmul = (a,b) => a*b; 

/* ]

Qs. Create a function using the "function" keyword that takes a String as an argument & returns the number of vowels in the string.


Qs. Create an arrow function to perform the same task. */


function vowel(str) {
    let count = 0;
    for (const char of str) {
        if(char ==="a" || char ==="i" || char ==="e" ||char ==="o" || char ===""){
            count++;
        }
    }
    console.log(count); 
}

const arrowvowel = (str) =>{
    let count = 0;
    let list = ['a', 'e', 'i', 'o', 'u'];
    for (x of str) {
        // if (list.indexOf(x)==0){ // this will check only if present in index 0  
        if (list.indexOf(x) != -1) {
            console.log(x);
            count++;
        }
    }
    return(count); 
}