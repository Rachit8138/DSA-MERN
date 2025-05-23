//1. average
average(2,3,4);

function average(a,b, c){
    console.log(avg=(a+b+c)/3);
}

// create af function to return the sum of numbers from 1 to n

function sum(a){
    let sum=0;
    for ( i=1;i<=a; i++){
        sum+=i;
    }
    return sum;
}
console.log(sum(10));
// return the concatenation of all strings
array=['r','a','c','h'];

function concat(array){
    let result='';
    for (i=0; i<array.length;i++){
        result+=array[i];

    }
    return result;
}
console.log(concat(array));

