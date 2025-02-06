let gameSeq = [];
let userSeq = [];
let btns = ["yellow", "grey", "purlple", "red"];

let started = false;
let level = 0;
let highscore = 1;

let h2 = document.querySelector("h2");
let h3 = document.querySelector("h3");
document.addEventListener("keypress", function(){
    if (started == false) {
        console.log("Game Started");
        started = true;       
        levelUp(); 
    }
});

function btnFlash(btn){
    btn.classList.add("flashBtn");
    setTimeout(function() {
        btn.classList.remove("flashBtn");
    }, 500);
}
function userFlash(btn){
    btn.classList.add("userFlash");
    setTimeout(function() {
        btn.classList.remove("userFlash");
    }, 500);
}

function levelUp() {
    userSeq = [];
    level++;
    if(level >= highscore){
        highscore = level;
    }
    h2.innerText = `Level ${level}`;
    let randIdx = Math.floor(Math.random() * 3);
    let randColor = btns[randIdx];
    let randBtn = document.querySelector(`.${randColor}`);
    gameSeq.push(randColor);
    console.log(gameSeq);
    btnFlash(randBtn);
}

function checkAns(idx) {
    if(userSeq[idx] === gameSeq[idx]) {
        if (userSeq.length == gameSeq.length) {
            setTimeout(levelUp, 1000);
        }
    } else {
        h2.innerHTML = `Game Over! Your score was <b>${level}</b> <br> Press any Key to Start.`;
        h3.innerHTML =`Highest Score =  ${highscore}`;
        document.querySelector("body").style.backgroundColor = "red";
        setTimeout(function () {
            document.querySelector("body").style.backgroundColor = "white";
        }, 1000)
        reset();
    }
}

function btnPress() {
    let btn = this;     
    userFlash(btn);
    
    userColor = btn.getAttribute("id");
    userSeq.push(userColor);

    checkAns(userSeq.length - 1);
}

let allBtns = document.querySelectorAll(".btn");
for (btn of allBtns) {
    btn.addEventListener("click", btnPress);
}

function reset() {
    started = false;
    gameSeq = [];
    userSeq = [];
    level = 0;
}

