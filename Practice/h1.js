const sum = (a,b)=>{
    console.log(a+b);
}

const calculator=(a,b, call)=>{
    call(a,b);
}

 calculator(54,23,sum)