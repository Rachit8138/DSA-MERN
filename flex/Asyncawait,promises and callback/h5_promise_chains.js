const getPromise = () => {
    return new Promise((resolve, reject) => {
        console.log("i am a promise");
        // resolve("success");
        reject("error")
    });
}

let promise = getPromise();

promise.then((res) => {
    console.log("promise fulfilled", res);
});

promise.catch((err) => {
    console.log("rejected", err);
});
// you will automatically have parameter res and err 
 