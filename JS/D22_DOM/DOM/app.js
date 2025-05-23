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
console.log(document.querySelector("h1").textContent);
console.log(document.querySelector("#description"));
console.log(document.querySelector(".oldimg"));
console.log(document.querySelector("div a"));// will give you the first element found in div of 'a' element
console.log(document.querySelectorAll("p"));// gives you all the element 'p'

/* Using properties and method */

console.log(document.querySelector("p").innerHTML);

let heading = document.querySelector('h1');
// heading.innerHTML="<u> Spiderman </u>";
console.dir(heading);
heading.innerHTML=`<u> ${heading.innerText}</u>`
console.log(heading.innerHTML);
/* 
new chapter
manipulating attributes
*/

/* very imp qn */
// change all the anchor ag into blue
let links=document.querySelectorAll('.box a') //which is inside the box wala
// for (let i=0; i < links.length; i++){
//     links[i].style.color='purple';
// }

for (link of links ){
    link.style.color='yellow';
}




/* new chapter 

Manipulating style */

let headerr =document.querySelector('h1')
console.log(headerr.classList);
headerr.classList.add("brown");// this will make the changes in the file and giv you the output and yesko bhitra bhaeko classes
headerr.classList.remove("brown");// removes
headerr.classList.contains("brown");// gives true or false
console.log(headerr.classList.toggle("brown"));
console.log(headerr.classList.toggle("brown"));
// 
/* new 
Navigation
*/
let h4=document.querySelector('h4');
console.log(h4.parentElement);
let box =document.querySelector(".box");
console.log(box.children);
console.log(box.childElementCount);

let imagesss = document.querySelector('img');
console.log(imagesss.previousElementSibling);
console.log(imagesss.nextElementSibling);
console.log(console.log(imagesss.previousElementSibling.style.color="green"));

/* 
Adding element 
 */

let newP =document.createElement('p');
console.log(newP);
newP.innerText="hi i am new p"

let body=document.querySelector('body');
console.log(body.appendChild(newP));
newP.append("this is new append")
console.log(newP);


/* did this myself where i choosed about which is in h2 and made it bold */
ab=document.querySelector('h2')
ab.innerHTML=`<u> ${heading.innerText}</u>`
