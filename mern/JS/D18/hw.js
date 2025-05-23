// Qs1. Create a program that generates a random number representing a dice roll.
// [The number should be between 1 and 6].
console.log(Math.floor(Math.random()*6)+1); // here 6 wil be in open bracket ie. (0,6) +1 will make it 1 to 6

// Qs2. Create an object representing a car that stores the following properties for the
// car: name, model, color.
// Print the car’s name.

const car = {
    name:"mercedes",
    model: 3,
    color: "red",
}

console.log(car.name);

// Qs3. Create an object Person with their name, age and city.
// Edit their city’s original value to change it to “New York”.
// Add a new property country and set it to the United States.

const person ={
    name:"Rachit",
    age: 9,
    city:"nepal"
}
person.city="New York";
person.country="United States";
console.log(person);

