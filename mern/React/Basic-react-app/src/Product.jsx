import "./Product.css";

function Product({ title, priced }) {
    let isDiscount = priced > 300;

    let styles = {
        backgroundColor: isDiscount ? "pink" : ""
    };

    return (
        <div className="Product" style={styles}>
            <h3>{title}</h3>

            <h5 style={styles}>Price: {priced}</h5>

             {isDiscount && <p>Discount of 5%</p>}
        </div>
    );
}

export default Product;