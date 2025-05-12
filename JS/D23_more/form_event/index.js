let form = document.querySelector("form");
form.addEventListener("submit", function(){
    event.preventDefault();
    console.log("form submitted");
})