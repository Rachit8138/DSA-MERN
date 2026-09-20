function handleClick(event) {
  console.log(event);
  console.log("Hello");
}

function printBye() {
  console.log("Bye");
}
function handleHover() {
  console.log("hover");
}
export default function Button() {
  return (
    <div>
      <button onClick={handleClick}>Click me </button>
      <p onClick={printBye}>This is paragraph</p>
      <button onMouseOver={handleHover}>Hover</button>

      {/*  */}
      <form onSubmit={handleFormSubmit}>
        <input placeholder="write something" />
        <button>Submit</button>
      </form>
    </div>
  );
}

function handleFormSubmit(event) {
//   event.preventDefault();
  console.log("Form was submitted");
}
