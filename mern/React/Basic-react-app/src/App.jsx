import "./App.css";// the styling comes from here 
import Title from "./Title.jsx"
import ProductTab from "./ProductTab.jsx"
import Hw from "./Hw.jsx"

// basically requiring product from producttab


function Description(){
  return <h3>Description</h3>
}

function App() {// whatever is returned by the app it is out component 
  return (// single element is returned 
  <>
    {/* <h1>this is my app component</h1>
    <p>inside app comonent we have</p>
    <Title/>
    <Description/> */}

    {/* <ProductTab/> */}
    

      <Hw username="rachit" textcolor="pink" />
      <Hw username="hello" textcolor="red" />
  </>
  )
}

export default App;
