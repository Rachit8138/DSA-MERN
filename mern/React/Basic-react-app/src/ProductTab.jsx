import { Product, Price, Description } from "./Product.jsx";

function ProductTab() {
    let option1=["hitech","durable", "fast"];//array
    let option2={a:"hitech",b:"durable",c:"fast"};// for objects
    return (
        <div>
            <Product title="phone" priced={9000/2} features1={option1} features2={option2}/>
            {/* <Product title="laptop" priced="8,500"/>
            <Product title ="pen" /> */}
            {/* <Price />
            <Description /> */}
        </div>
    );
}

export default ProductTab;