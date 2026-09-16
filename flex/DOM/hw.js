// Let‘s Practice
// Qs. Create a H2 heading element with text - “Hello JavaScript”. Append “from Apna College"
//  to this text using JS.
let heading = document.querySelector("h2");
console.dir(heading.innerText)

heading.innerText=heading.innerText+"from Apna College";// conatinate

console.dir(heading.innerText)

// Qs. Create 3 divs with common class name - “box”. Access them & add some unique text to each
// of them.
let div = document.querySelectorAll(".box")
// div[0].innerText= "new 1"
// div[1].innerText= "new 2"
// div[2].innerText= "new 3"

let i =0;
for(a of div){
    // console.log(a.innerText);
    a.innerText= `new unique value ${i}`;
    console.log(a.innerText);
    i++;
}



/*
 `${}` 
``--> is called backtick 
 */