// export default function Price({ oldPrice, newPrice }) {
//   let oldStyles = {
//     textDecorationLine: "line-through",
//   };
//   let newStyles = {
//     fontWeight: "bold",
//   };
//   let styles = {
//     backgroundColor: "#e0c367",
//     height: "30px",
//     borderBottomRightRadius: "14px",
//     borderBottomLeftRadius: "14px",
//   };

import { backgroundColorNames } from "chalk";

//   return (
//     <div style={styles}>
//       <span style={oldStyles}>{oldPrice}</span>
//       &nbsp;&nbsp;&nbsp;
//       <span style={newStyles}>{newPrice}</span>
//     </div>
//   );
// }

export default function Price({ old, news }) {
  return (
    <div style={{ 
      backgroundColor: "yellow", 
      borderBottomLeftRadius:"14px",
      borderBottomRightRadius:"14px",
      width:"210px"
      
      }}>
      <span style={{
        textDecoration:"line-through"
      }}>{old}</span>
      &nbsp; &nbsp;
      <span style={{
        fontWeight:"bold"
      }}>{news}</span>
    </div>
  );
}
