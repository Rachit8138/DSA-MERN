/* very imp for understanding the scope */

let greet ='hello';     //global scope

function changegreet(){
    let greet='namaste';// function scope
    console.log(greet); 
    function innergreet(){
        console.log(greet);//lexical scope
    }
}

console.log(greet);
changegreet();