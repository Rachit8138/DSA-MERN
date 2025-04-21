let btn =document.querySelector("button");
btn.addEventListener("click",function(event){
    console.log(event);
    console.log("buttonclicked");
});

let imp=document.querySelector("input");
imp.addEventListener("keydown",function(){
    console.log("key was pressed");
});

