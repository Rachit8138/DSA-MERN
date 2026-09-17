import { Product, Price, Description } from "./Product.jsx";

function ProductTab() {
    return (
        <div>
            <Product title="phone" priced={9000/2} />
            <Product title="laptop" priced="8,500"/>
            <Product title ="pen" />
            {/* <Price />
            <Description /> */}
        </div>
    );
}

export default ProductTab;