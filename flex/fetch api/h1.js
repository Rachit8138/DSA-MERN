const URL = "https://api.potterdb.com/v1/characters";
const factPara = document.querySelector("#fact");
const btn = document.querySelector("#btn");

const getFacts = async () => {
    try {
        console.log("getting data .....");
 
        // Fetch data from Potter DB API
        let response = await fetch(URL);
        console.log(response);

        // Convert response to JSON
        let data = await response.json();

        console.log(data);

        // Get a random character
        let character = data.data[Math.floor(Math.random() * data.data.length)];

        // Display character name
        factPara.innerText = character.attributes.name;

    } catch (error) {
        console.error("Error fetching data:", error);
        factPara.innerText = "Failed to load Harry Potter character.";
    }
};
btn.addEventListener("click",getFacts);


// --------------video
/* 
const URL = "https://cat-fact.herokuapp.com/facts";
const factPara = document.querySelector("#fact");
const btn = document.querySelector("#btn");

const getFacts = async () => {
    console.log("getting data .....");
    let response = await fetch(URL);
    console.log(response); //JSON format
    let data = await response.json();
    factPara.innerText = data[2].text;
};
// -----------promise chaining
function getFacts() {
    fetch(URL)
        .then((response) => {
            return response.json();
        })
        .then((data) => {
            console.log(data);
            factPara.innerText = data[2].text;
        });
}


btn.addEventListener("click", getFacts);


// */

// const URL = "https://example.com/api";

// const data = {
//     name: "Rachit",
//     age: 22
// };

// const options = {
//     method: "POST",
//     headers: {
//         "Content-Type": "application/json"
//     },
//     body: JSON.stringify(data)
// };

// const sendData = async () => {
//     try {
//         const response = await fetch(URL, options);

//         const result = await response.json();

//         console.log(result);
//     } catch (error) {
//         console.error("Error:", error);
//     }
// };

// sendData();



