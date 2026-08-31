function asyncFunc1() {//takes 4 seconds
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      console.log("some data1");
      resolve("success");
    }, 4000);
  });
}

function asyncFunc2() {//takes 2 seconds
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      console.log("some data2");
      resolve("success");
    }, 2000);
  });
}


let promise =asyncFunc1();
console.log("getting data of 1");
promise.then(()=>{
  return asyncFunc2();
})
.then(()=>{
  console.log("got all ");
})
