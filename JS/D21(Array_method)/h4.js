function sum(...args){// arguments
    for (let i=0; i<args.length; i++){
        console.log("you gave us: ", args[i]);
    }

}
sum(2,3,4,5);

function min(...array){
    console.log(arguments);// it is an inbuilt way to access arguments. 
}
min(2,3,4,5);
// you cannot use method on arguments so that's why we use following 

/* reast conclusion program  */

function add(...args){
    return args.reduce((sum, el)=> sum+el);
}
console.log(add(5,7,4,6,4));

function low(...args){
    return args.reduce((low, el)=>{
        if(low>el){
            return el;
        } else{
            return low;
        }
    });
}

console.log(low(5,7,4,6,4));

//asdfa