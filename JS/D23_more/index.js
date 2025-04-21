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


// //3. Event Listener
// let bt=document.querySelectorAll("button");/*returns a nodelist  */
// for (b of bt){
//     // b.addEventListener("click",sayHel);
//     // b.addEventListener("click",sayName);
//     b.addEventListener("dblclick",function(){
//         console.log("you double clicked");
//     });
// }

// function sayHel(){
//     alert("Hello")
// };

// function sayName(){
//     alert("Apna College")
// };

// 4. this

let btn=document.querySelectorAll("button");
for (b of btn){
b.addEventListener("click",function(){
    console.log(this.innerText);
    this.style.backgroundColor="blue";// to change the color       
})};

// 5. for multiple btn, p, h1, h3

let p = document.querySelector ("p");
let h1= document.querySelector ("h1");
let h3 = document. querySelector ("h3");
function changeColor() {
    console.dir(this.innerText);
    this.style.backgroundColor = "blue";
}

p.addEventListener ("click", changeColor);
h1.addEventListener ("click", changeColor);
h3.addEventListener("click", changeColor);