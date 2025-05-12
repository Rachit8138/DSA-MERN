let btn =document.querySelector("button");
btn.addEventListener("click",function(event){
    console.log(event);
    console.log("buttonclicked");
});

let imp=document.querySelector("input");// same can be used for keyup for knowing the key releaed
imp.addEventListener("keydown",function(event){
    console.log(`Key: ${event.key}`);// only writing event will give pointerEvent
    console.log(`code: ${event.code}`);// gives us the code 
    console.log("key was pressed");
/*  knowing if arrowup is pressed */
    if (event.code == "ArrowUp") {
        console.log("ArrowUp key was pressed");
    }
});

