// promise chaining from call back hell 
// function getData(dataId, getNextData) {// getNextData is taking a callback 
//   //2s
//   setTimeout(() => {
//     console.log("data", dataId);
//     if (getNextData) {
//       getNextData();
//     }
//   }, 5000);
// }

// //callback hell
// getData(1, () => {
//   console.log("getting data2 ....");
//   getData(2, () => {
//     console.log("getting data3 ....");
//     getData(3, () => {
//       console.log("getting data4 ....");
//       getData(4);
//     });
//   });
// });
// to solve this pyramid of doom we have promises 

function getData(dataId, getNextData) {// getNextData is taking a callback 
  //2s
  return new Promise((resolve, reject)=>{
    setTimeout(() => {
    console.log("data", dataId);
    resolve("success");
  }, 2000);
  });
  
} 

// getData(1).then((res)=>{
//     console.log(res);
//     // for the second data 
//     getData(2).then(()=>{
//         console.log(res);
//     })
// })

// chain of .then or promise chaining 
console.log("getting data1 ....");
getData(1)
  .then((res) => {
    console.log("getting data2 ....");
    return getData(2);
  })
  .then((res) => {
    console.log("getting data3 ....");
    return getData(3);
  })
  .then((res) => {
    console.log("getting data4 ....");
    console.log(res);
  });


  // promise chaining is still difficult to understand that's why we use async await
  