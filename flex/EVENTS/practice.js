let btn = document.querySelector("#btn");
// btn.addEventListener("mouseover",()=>{
//     document.querySelector("body").style.backgroundColor="red"
// })
// btn.addEventListener("mouseout",()=>{
//     document.querySelector("body").style.backgroundColor="green"
// })
let a= "on";


btn.addEventListener("click",()=>{
    if(a==="on"){
        a="off";
        document.querySelector("body").style.backgroundColor="blue";
    }else{
        a="on";
        document.querySelector("body").style.backgroundColor="red";
    
    }
})
