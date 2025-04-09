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

/* Using properties and method */
/* let para = document.getElementById('p')
para.innerText='abc';
'abc'   
para.innerHTML="hi, i am <b> Peter parker</b>";
'hi, i am <b> Peter parker</b>'
 */

let heading = document.querySelector('h1');
console.dir(heading);// to display the properties of h1
console.log(heading);// to display the value of the heading

// heading.innerHTML="<u> Spiderman </u>";
heading.innerHTML=`<u> ${heading.innerText}</u>`
/* 
new chapter
manipulating attributes
*/

let img =document.querySelector('img')
console.dir(img);// displays the property 

let headings =document.querySelector('h1')
console.log(headings);


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
headerr.classList.add("green");// this will make the changes in the file and giv you the output and yesko bhitra bhaeko classes
headerr.classList.remove("green");// removes
headerr.classList.contains("green");// gives true or false
console.log(headerr.classList.toggle("green"));
console.log(headerr.classList.toggle("green"));

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