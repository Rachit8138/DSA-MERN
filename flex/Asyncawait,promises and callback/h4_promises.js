// let promise = new Promise((resolve, reject)=>{
//     console.log("i am promise");
//     resolve("some error "); // if you want to fulfill your promise // make even reject
// })

function getData(dataId, getNextData) {
  return new Promise((resolve, reject) => {// generally api java hamile call garchau yesari nae promise return garcha  
    //2s
    setTimeout(() => {
      console.log("data", dataId);// if we successfully return the data then resolve it 
      resolve("success");
      if (getNextData) {
        getNextData();
      }
    }, 5000);
  });
}
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

/* if we couldnot send the data, we reject the api, throwing error   */
// function getData(dataId, getNextData) {
//   return new Promise((resolve, reject) => {// generally api java hamile call garchau yesari nae promise return garcha  
//     //2s
//     setTimeout(() => {
//       reject("error");
//       if (getNextData) {
//         getNextData();
//       }
//     }, 5000);
//   });
// }

// generally we don't have ro resolve and reject generally other do this owrk 