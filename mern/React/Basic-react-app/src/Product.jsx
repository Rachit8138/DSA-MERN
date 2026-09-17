import "./Product.css";

function Product({title, priced}) {// {title}arguments
    console.log(title);
    // console.log(props.title);// we know that it will be printed only in the console window
    return (
        <div className="Product">
            <h3>{title}</h3>
            <h5>Price:{priced}</h5>
        </div>
    );
}

function Price() {
    return <h4>Price: Rs. 500</h4>;
}

function Description() {
    return <p>This is a product description.</p>;
}

// Named exports
export { Product, Price, Description };