function getData(dataId, getNextData) {// getNextData is taking a callback 
  //2s
  setTimeout(() => {
    console.log("data", dataId);
    if (getNextData) {
      getNextData();
    }
  }, 2000);
}

//callback hell
getData(1, () => {
  console.log("getting data2 ....");
  getData(2, () => {
    console.log("getting data3 ....");
    getData(3, () => {
      console.log("getting data4 ....");
      getData(4);
    });
  });
});
// to solve this pyramid of doom we have promises 
