// array=[2,3,4,5,6,4];


// array.forEach(element => {
//     console.log(element);
// });

// let marks=array.map(element=>{
//     return element.marks+1;
// });

// console.log(marks);
// let gpa =arr.map((el)=>{
//     return el.marks/10;
// });

array=[2,3,4,5,6,67,5];
/* forEach */
array.forEach(el=>{
    console.log(el)
});

console.log();
/* map */
array.map(el=>{
    console.log(el*3);
});
// you can even store it in an array
let a=array.map(el=>{
    return el*2
});
console.log(a);

/* every */
console.log(array.every(el=>el%2==0));
/* some */
console.log(array.some(el=>el%2==0));

/* filter  */
console.log(array.filter(el=>el%2==0));

/* reduce */
console.log(array.reduce((acc,el)=>acc+el));


array.forEach(el=>{
    console.log(el);    
})

/* for finding the maximum */

console.log();

let max=array.reduce((max,el)=>{
    if(el>max){
        return el;
    } else{
        return max
    }
})
// here the end value will be returned at the last
console.log(max);

let nums=[20,20,30,40];

console.log(nums.every(el=>el%10==0));

// to find out the minimum

console.log(nums.reduce((min,el) => {
    if(el<min){
        return el;
    } else { 
        return min;
    }
}));