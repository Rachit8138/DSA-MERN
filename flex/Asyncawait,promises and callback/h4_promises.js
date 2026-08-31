// function getData(dataId) {
//   return new Promise((resolve, reject) => {// generally api java hamile call garchau yesari nae promise return garcha  
//     //2s
//     setTimeout(() => {
//       console.log("data", dataId);// if we successfully return the data then resolve it 
//       resolve("success");
//     }, 5000);
//   });
// }

// /* to test  */
// let promise = getData(131)
// undefined

// promise
// Promise {<pending>}[[Prototype]]: Promise
// [[PromiseState]]: "pending"
// [[PromiseResult]]: undefined
// h4_promises.js:10 data 131

// promise
// Promise {<fulfilled>: 'success'}
// [[Prototype]]: Promise
// [[PromiseState]]: "fulfilled"
// [[PromiseResult]]: "success"

// generally we don't create promise, we are returned promise 
const getPromise = (data) => {
    return new Promise((resolve, reject) => {
        console.log("I am a promise");
        setTimeout(() => {
            resolve(data);
        }, 3000);
    });
};

let promise = getPromise(12);
console.log("Promise:", promise);
promise.then((res) => {
    console.log("promise fulfilled", res);
});

promise.catch((err) => {

    console.log("rejected", err);
    console.log("Promise:", promise);

});