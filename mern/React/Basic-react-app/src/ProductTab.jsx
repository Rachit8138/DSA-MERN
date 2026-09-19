import  Product from "./Product.jsx";

function ProductTab() {
    // let option1=["hitech","durable", "fast"];//array
    // let option2={a:"hitech",b:"durable",c:"fast"};// for objects
    return (
        <>
            <Product title="phone" priced={9000/2} />
            <Product title="laptop" priced="8,500"/>
            <Product title ="pen" priced={1000}/>
            {/* <Price />
            <Description /> */}
        </>
    );
}

export default ProductTab;