// Let‘s Practice
// Qs. Create a new button element. Give it a text “click me”, background color of red & text color
// of white.
let btn = document.createElement("button");

btn.innerText = "click me";

btn.style.backgroundColor = "red";
btn.style.color = "white";

document.body.prepend(btn);

// Insert the button as the first element inside the body tag.
// Qs. Create a <p> tag in html, give it a class & some styling. 
// Now create a new class in CSS and try to append this class to the <p> element.
// Did you notice, how you overwrite the class name when you add a new one?
// Solve this problem using classList.

let para = document.querySelector("p");

para.classList.add("newClass");