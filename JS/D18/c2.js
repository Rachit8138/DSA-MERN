/* 1. Generate random number between 1 to 100 */
// console.log(Math.floor(Math.random()*100)+1);

/* 2. Generate random number between 1 to 5*/
// console.log(Math.floor(Math.random()*5)+1);

/* 3. guessing game from 1 to 10 */
const max =prompt("enter the range");
const random=Math.floor(Math.random()*max)+1;
let guess = prompt("enter the number")

while(true){
    
    if (guess=="quit"){
        console.log("exit")
        break;
    }

    if (guess == random){
        console.log(`correct, number was: ${guess}`);
        break;
    } else if(guess < random){
        guess = prompt("hint: too small, type again");
    } 
    else {
        guess = prompt("hint: too high, typ again");
    }

    
}