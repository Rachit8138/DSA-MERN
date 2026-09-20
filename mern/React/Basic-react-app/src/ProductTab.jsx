// import Product from "./Product.jsx";

// export default function ProductTab() {
//   // let styles = {
//   //   display: "flex",
//   //   // flexWrap: "wrap",
//   //   // justifyContent: "center",
//   //   // alignItems: "center",
//   // };

//   return (
//     <>
//       <h1>Blockbuster Deals | Shop now </h1>
//       <div style={{display:"flex"}}>
//       <Product title="Logitech MX Master" idx={0} />
//       <Product title="Apple Pencil (2nd Gen)" idx={1} />
//       <Product title="Zebronics " idx={2} />
//       <Product title="Petronics Toad 23" idx={3} />
//     </div>
//     </>
    
//   );
// }

import Product from "./Product.jsx"
export default function Producttab(){
  return(
    <>
    <h1>Blockbuster Deals ! Shop Now</h1>
    <div style={{display:"flex"}}>
       <Product title="Logitech MX Master" idx={0} />
       <Product title="Apple Pencil (2nd Gen)" idx={1} />
       <Product title="Zebronics " idx={2} />
       <Product title="Petronics Toad 23" idx={3} />
    </div>
    </>
  )
}