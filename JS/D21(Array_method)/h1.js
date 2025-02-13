let arr=[{
    name:'aman',
    marks:95
},{
    name:'shradha',
    marks:94
}];
/* forEach */
let array=[];// i have this array for the some method
arr.forEach((el)=>{
    console.log(el.marks);
    array.push(el.marks);// used this line for some method only
})
/* Map */
let gpa =arr.map((el)=>{
    return el.marks/10;
});

/* Filter */

let value=arr.filter((el)=>{
    return el.marks%2==0;
})

let num =[1,2,3,4,7,8,3,23,56,7];// it usually filters out ther required value
let ans=num.filter((el)=>{
    return el%2==0;
});

console.log(value);

/* every */
console.log(array);
console.log(array.some((el)=>(el%2==0)));//it was very difficult to use this method

/* reduce */
let nums=[1,2,3,4];
let finalval=nums.reduce((res, el)=> res+el);
console.log(finalval);

/* maximum in an array uring reduce */
let max=nums.reduce((max,el)=>{
    if(el>max){
        return el;
    }else{
        return max;
    }
})
console.log(max);