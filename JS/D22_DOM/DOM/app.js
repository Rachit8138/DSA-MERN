/* //getElementById
console.log(document.getElementById("description"));//->p#description which is an object that is returned 
 */


/* 
// getElementsByClassName
let smallImages=document.getElementsByClassName("oldimg");
for(let i=0;i<smallImages.length;i++){
    console.log(smallImages[i].src)// [i] will give me the index
}

for (let i=0;i<smallImages.length;i++){
    smallImages[i].src="Assets/Spider-Man.png";
    console.log(`value of image ${i} is changed`);
} */


/* 
// getElementsByTagName
console.log(document.getElementsByTagName("p"));// p p
 */


/* Query */
console.log(document.querySelector("h1"));
console.log(document.querySelector("#description"));
console.log(document.querySelector(".oldimg"));
console.log(document.querySelector("div a"));// will give you the first element found in div of 'a' element
console.log(document.querySelectorAll("p"));// gives you all the element 'p'



