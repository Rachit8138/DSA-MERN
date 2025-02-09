let arr=[{
    name:'aman',
    marks:95
},{
    name:'shradha',
    marks:94
}];
/* forEach */
arr.forEach((el)=>{
    console.log(el.marks);
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
