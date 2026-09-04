//-----------------------------------------------------------------------------------------
// using the async await function in the getData()

 function getData(dataId) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      console.log("data", dataId);
      resolve("success");
    }, 2000);
  });
}

async function getAllData(){
    console.log("getting data1....");
    await getData(1);
    console.log("getting data2....");
    await getData(2);
    console.log("getting data3....");
    await getData(3);
    console.log("getting data4....");
    await getData(4); 
}
// getAllData();
// ------------------------------------------------------------------------------------


/* 
let promise = getAllData();
h8.js:29 getting data1....
undefined
promise
Promise {<pending>}[[Prototype]]: Promise[[PromiseState]]: "pending"[[PromiseResult]]: undefined
h8.js:22 data 1
h8.js:31 getting data2....
h8.js:22 data 2
h8.js:33 getting data3....
h8.js:22 data 3
h8.js:35 getting data4....
h8.js:22 data 4
promise
Promise {<fulfilled>: undefined}[[Prototype]]: Promise[[PromiseState]]: "fulfilled"[[PromiseResult]]: undefined
*/
  
// -----------------------------------------------------------------------------------------
/* how IIFE  is normally declared  */

/* 
automatically the function will be executed no need to call it like previously 

*/

// (async ()=> {
//     console.log("getting data1....");
//     await getData(1);
//     console.log("getting data2....");
//     await getData(2);
//     console.log("getting data3....");
//     await getData(3);
//     console.log("getting data4....");
//     await getData(4); 
// })();

// // downside is you won't be able to use it again 