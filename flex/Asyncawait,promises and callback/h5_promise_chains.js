
// solving callback hell using promise chaining
function getData(dataId) {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      console.log("data", dataId);
      resolve(dataId);
    }, 2000);
  });
}

getData(1)
  .then((data1) => {
    console.log(data1);
    return getData(2);
  })
  .then((data2) => {
    console.log(data2);
    return getData(3);
  })
  .then((data3) => {
    console.log(data3);
  });
