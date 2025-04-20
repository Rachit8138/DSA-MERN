/* let btn=document.querySelector("button");
console.dir(btn);

btn.onclick=function (){// onclick property can be set to a particular function onclikc is associated with function
    alert("button was clicked");
}; */

// // 2. same but for multiple buttons
// let btn=document.querySelectorAll("button");/*returns a nodelist  */
// for (b of btn){
//     b.onclick=sayHello;/* if one of the button is clicked and on sayHello() the function is executed */
// /* sayHello() and executes it right away, not waiting for a click. */
// /* “When this button is clicked, then run the sayHello function.” */
//     b.onmouseenter =function(){
//         console.log("you are entering the button");
//     }
// }
// function sayHello(){
//     alert("liked");
// }


//3. Event Listener
let bt=document.querySelectorAll("button");/*returns a nodelist  */
for (b of bt){
    // b.addEventListener("click",sayHel);
    // b.addEventListener("click",sayName);
    b.addEventListener("dblclick",function(){
        console.log("you double clicked");
    });
}

function sayHel(){
    alert("Hello")
};

function sayName(){
    alert("Apna College")
};

// 4. 