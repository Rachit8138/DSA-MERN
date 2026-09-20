import Product from "./Product.jsx";

export default function ProductTab() {
  let styles = {
    display: "flex",
    // flexWrap: "wrap",
    // justifyContent: "center",
    // alignItems: "center",
  };

  return (
    <div style={styles}>
      <Product title="Logitech MX Master" idx={0} />
      <Product title="Apple Pencil (2nd Gen)" idx={1} />
      <Product title="Zebronics " idx={2} />
      <Product title="Petronics Toad 23" idx={3} />
    </div>
  );
}