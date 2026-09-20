/* const url ="https://api.potterdb.com/v1/characters";
const fatip=document.querySelector("#fact");
const bn = document.querySelector("#btn");

const fact = async ()=> {
    try{
        console.log("getting data");
        let response = await fetch(url);
        console.log(response);

        let x = await response.json();
        console.log(x);
        
        let content =x.data[Math.floor(Math.random() * x.data.length)];
        fatip.innerText=content.attributes.name;
        
    }catch(error){
        console.error("this was the error",error);
        fatip.innertext="error popped";
    }
};

bn.addEventListener("click",fact)
 */
