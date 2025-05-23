// Qs1. Write a JS program to delete all occurrences of element ‘num’ in a given array.
// Example : if arr = [1, 2, 3, 4, 5, 6, 2, 3] & num = 2
// Result should be arr = [1, 3, 4, 5, 6, 3]

let arr = [1, 2, 3, 4, 5, 6, 2, 3];
let num = 2;

for (let i=0; i<arr.length;i++){
    if(arr[i]==num){
        arr.splice(i,1)
    }
}

console.log(arr);

// Qs2. Write a JS program to find the no of digits in a number.
// Example : if number = 287152, count = 6
let n =287152;
let count=0;
let c=n;
while(c > 0){
    c=Math.floor(c/10);
    count++;
}
console.log(`${n} has ${count} digits`)


// Qs3. Write a JS program to find the sum of digits in a number.
// Example : if number = 287152, sum = 25
let na =287152;
let sum=0;
a=na;
while(a > 0){
    rem=a%10;
    sum=sum+rem;
    a=Math.floor(a/10);
}
console.log(sum)

// Qs4. Print the factorial of a number n.
// [Factorial of a number n is the product of all positive integers less than or equal to a
// given positive integer and denoted by that integer. ]
// Example :

// 7! (factorial of 7) = 1x2x3x4x5x6x7 = 5040
// 5! (factorial of 5) = 1x2x3x4x5 = 120
// 3! (factorial of 3) = 1x2x3 = 6
// 0! Is always 1

let x=10;
let fact=1;
for (i=2;i<=x;i++){// when you are assigning the value directly no need to keep the let 
    fact*=i;
}
console.log(fact)


// Qs5. Find the largest number in an array with only positive numbers.
let arra=[2,5,10,4,2,7,1,9];
let largest=arra[0];
for (i=0;i<arra.length;i++){
    if(largest<arra[i]){
        largest=arra[i];
    }
}
console.log("largest is: ", largest)

// read the notes and see the usage of splic in the array
