let nums=[20,20,30,40];

// 1. Check if all numbers in our array are multiples of 10 or not
/* since it is in And condition */
console.log((nums.every((el)=>el%10==0)==true));

// 2. Create a function to find the min number in an array. 
/* to find out the minimum */
let min = nums.reduce((min,el)=>{
    if(el<min){
        return el;
    } else{
        return min;
    }
})
 console.log(min);