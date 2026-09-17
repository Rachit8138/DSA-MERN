import "./Store.css"

function Store(){
    return (
        <div className="rachit">
            <h1>Thimile Store</h1>
        </div>
    )
}

function Location(){
    return(
        <h3>Lalitpur, Satdobato-14</h3>
    );
}

function Tax(){
    return(
        <h3> Vat no: 9825714788</h3>
    );
}
// named exports
export {Store, Location, Tax};