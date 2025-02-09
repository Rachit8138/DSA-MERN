let arr=[{
    name:'aman',
    marks:95
},{
    name:'shradha',
    marks:94.4
}];
/* forEach */
arr.forEach((student)=>{
    console.log(student.marks);
})
/* Map */
let gpa =arr.map((el)=>{
    return el.marks/10;
});
