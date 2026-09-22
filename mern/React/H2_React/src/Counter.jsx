// export default function  () {
//   let count = 0;

//   function incCount() {
//     count += 1;
//     console.log(count);
//   }

//   return (
//     <div>
//       <h3>Count = {count}</h3>
//       <button onClick={incCount}>Increase Count</button>
//     </div>
//   );
// }

import
 { useState } from "react";

// export default function Counter() {
//   let arr = useState(0);
//   console.log(arr);

//   return (
//     <div>
//       <h3>Count = {}</h3>
//       <button>Increase Count</button>
//     </div>
//   );
// }

export default function Counter() {
    let [count, setCount] = useState(0);

    console.log("component is re-executed");
    console.log("count =", count);

    let incCount = () => {
        setCount(count + 1);
        console.log("new value =", count);
    };

    return (
        <div>
            <p>Count = {count}</p>
            <button onClick={incCount}>Increase Count</button>
        </div>
    );
}