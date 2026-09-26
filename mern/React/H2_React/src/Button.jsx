// function handleClick(event) {
//   console.log(event);
//   console.log("Hello");
// }
// function printBye() {
//   console.log("Bye");
// }
// function handleHover() {
//   console.log("hover");
// }
// export default function Button() {
//   return (
//     <div>
//       <button onClick={handleClick}>Click me </button>
//       <p onClick={printBye}>This is paragraph</p>
//       <button onMouseOver={handleHover}>Hover</button>

//       {/*  */}
//       <form onSubmit={handleFormSubmit}>
//         <input placeholder="write something" />
//       </form>
//     </div>
//   );
// }

// const handleFormSubmit=(event)=> {
//   event.preventDefault();
//   console.log("Form was submitted");
// }
import './App.css';
const onClick=(event)=>{
  console.log(event);
  console.log("clicked");

}
function ondbl(){
  console.log("double clicked");
}
function mouse(){
  console.log("mouse hovered");
}
function handleevent(e){
  e.preventDefault();
  console.log("handled default behavior");

}


export default function Button(){
  return(
    <div>
    <button onClick={onClick}>onClick</button>
    <p onDoubleClick={ondbl}>Double click</p>
    <button onMouseOver={mouse}>Hover</button>
    <form onSubmit={handleevent}>
      Name: <input placeholder='enter somethign'></input>
    </form>
    </div>
  );
}