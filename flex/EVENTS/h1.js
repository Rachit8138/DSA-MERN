let btn1 = document.querySelector("#btn");

// 2. Add an anonymous event listener (handler1)
btn1.addEventListener("click", () => {
  console.log("button1 was clicked - handler1");
});

// 3. Add a second anonymous event listener (handler2)
btn1.addEventListener("click", () => {
  console.log("button1 was clicked - handler2");
});

// 4. Define a named function reference (handler3)
const handler3 = () => {
  console.log("button1 was clicked - handler3");
};

// 5. Add the named function as a listener
btn1.addEventListener("click", handler3);

// 6. Add a third anonymous event listener (handler4)
btn1.addEventListener("click", () => {
  console.log("button1 was clicked - handler4");
});

// 7. Remove the named function listener
// This prevents handler3 from running when the button is clicked
btn1.removeEventListener("click", handler3);

// Qs. Create a toggle button that changes the screen to dark-mode when clicked & light-mode
// when clicked again.

let hw = document.querySelector("#hw");
let currmode="light";// dark 
hw.addEventListener("keyup", (event)=>{
    if(currmode==="light"){
        currmode ="dark";
        document.querySelector("body").style.backgroundColor="black";
    }else{
        currmode="light";
        document.querySelector("body").style.backgroundColor="white";
    }
    console.log(currmode);
})

// const box = document.querySelector('.box');
// box.addEventListener('mouseover', () => {
//   box.style.backgroundColor = 'yellow';
// });
// box.addEventListener('mouseout', () => {
//   box.style.backgroundColor = 'white';
// });
