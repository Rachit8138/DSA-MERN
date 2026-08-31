function getData(dataId, getNextData) {// getNextData is taking a callback 
  //2s
  setTimeout(() => {
    console.log("data", dataId);
    if (getNextData) {// this referencde the function  to check if there is a function
      getNextData();// this executes the function
    }
  }, 2000);
}

//callback hell
console.log("getting data1...");
getData(1, () => {
  console.log("getting data2 ...."  );
  getData(2, () => {
    console.log("getting data3 ....");
    getData(3, () => {
      console.log("getting data4 ....");
      getData(4);
    });
  });
});
// to solve this pyramid of doom we have promises 
