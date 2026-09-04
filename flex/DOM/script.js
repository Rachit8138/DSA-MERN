// console.log(window.document);// console.dir(document);
// console.dir(document); // IT prints because it is global object
// console.log(document.body);// returns you the html content
// console.dir(document.body);// return properties and object 
// console.dir(document.body)

// we write script tage just after body because if we write it in head section then head will load first and js file runs and it cannot access body bojects 
// ---------------------------------------------------------------

// let heading = document.getElementById("myId");
// console.log(heading);

// let head = document.getElementsByClassName("heading");
// console.dir(head)
// console.log(head)

// let parahs = document.getElementsByTagName("p");
// console.dir(parahs);

/* do the same thing for  */

// let firstEl = document.querySelector(".heading"); //1st element
// console.log(firstEl);

// let ALL = document.querySelectorAll(".heading"); //all elements
// console.log(ALL);

// ----------------------------------------------------------
let firstEl = document.querySelector(".heading"); //1st element
console.dir(firstEl.tagName);