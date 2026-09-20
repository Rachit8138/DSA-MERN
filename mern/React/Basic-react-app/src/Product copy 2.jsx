
import "./Product.css";

function Product({ title, priced }) {
    let isDiscount = priced > 300;// boolean expression

    let s = {// object
        color: isDiscount ? "pink" : ""
    };

    return (
        <div className="Product" style={s}>
            <h3>{title}</h3>
             <h5 style={s}>Price: {priced}</h5>

             {isDiscount && <p>Discount of 5%</p>}
            
        </div>
    );
}
// =======================================
export default Product;