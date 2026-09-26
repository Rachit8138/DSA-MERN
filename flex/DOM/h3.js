// element created 

// let newBtn = document.createElement("button")
// newBtn.innerText="click me"
// console.log(newBtn);

// // adding 
// let p = document.querySelector("p");
// p.after(newBtn)

// // creating new heading elements 
// let newheading = document.createElement("h1");
// newheading.innerHTML="<i> hi, i am new </i>";
// document.querySelector("body").prepend(newheading)

// // // deleting a node 

// let removing = document.querySelector("#re");
// removing.remove()


// let div = document.querySelector("#box");

// let pa = document.createElement("p");
// pa.innerText = "Hello World";

// div.appendChild(pa);

let btn =document.createElement("button");
btn.innerText="click me";
btn.style.backgroundColor="red";
btn.style.color="white";

document.querySelector("body").prepend(btn);