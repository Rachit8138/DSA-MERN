import "./App.css";// the styling comes from here 
import Title from "./Title.jsx"
import ProductTab from "./ProductTab.jsx"
import Hw from "./hw.jsx";

// basically requiring product from producttab


function Description(){
  return <h3>Description</h3>
}

function App() {// whatever is returned by the app it is out component 
  return (// single element is returned 
  <>
    {/* <ProductTab/> */}

    

      {/* <Hw username="rachit" textcolor="pink" />
      <Hw username="hello" textcolor="red" /> */}

      {/* This is my homework assignment */}

        <ProductTab/>
        
  </>
  )
}

export default App;
