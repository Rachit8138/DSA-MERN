let btn = document.querySelector("button");

btn.addEventListener("click", function () {
    let h3 = document.querySelector("h3");
    h3.innerText = getRandomcolor();
    console.log("color updated");

    let div = document.querySelector("div");
    div.style.backgroundColor = getRandomcolor();  // FIXED ✅
});

function getRandomcolor() {
    let red = Math.floor(Math.random() * 255);
    let green = Math.floor(Math.random() * 255);
    let blue = Math.floor(Math.random() * 255);

    let color = `rgb(${red},${green},${blue})`;
    return color;
}
