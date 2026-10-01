// import { useState } from "react";
// import {v4 as uuidv4} from "uuid";
// export default function TodoList() {
//     let [todos, setTodos] = useState([{task:"sample task", id :uuidv4()}]);// creatomg array of objects
//     let [newTodo, setNewTodo] = useState("");
//     let addNewTask = () => {
//         setTodos([...todos, {task:newTodo, id :uuidv4()}]);
//         setNewTodo("");
//     };
//     let updateTodoValue = (event) => {
//         console.log(event.target.value);
//         setNewTodo(event.target.value); // addnewtask-
//     };
//     let deleteTodo = (id) => {
//         setTodos((prev) => // adding a callback because our new value depends on previous value
//             prev.filter((todos) => todos.id != id))
//     }
//         //"React, give me the current/previous value of todos, and I'll calculate the new value from it."
//     return (
//         <div>
//             <input
//                 placeholder="add a task"
//                 value={newTodo}
//                 onChange={updateTodoValue}
//             />
//             <button onClick={addNewTask}>Add Task</button>
//             {/* <h3>Tasks Todo: {todos}</h3> */}
//             <ul>
//                 {
//                     todos.map((todo) =>  (
//                         <li key={todo.id}>
//                             <span>{todo.task}</span>
//                             &nbsp;
//                         <button onClick={() => deleteTodo(todo.id)}>Delete</button>
//                          {/* you want to pass the key but you can't send it as paramter then it will always be exectured so you will make a function so that it just passes it once as arrow function  */}

//                         {/* <button onClick={() => markAsDone(todo.id)}>Mark as Done</button> */}
//                         {/* <button onClick={() => upperCase(todo.id)}>UpperCase</button> */}
//                         </li> // while adding dynamically we must use unique key
//                     ))
//                 }
//             </ul>
//         </div>
//     );
// }

import { useState } from "react";
import { v4 as uuidv4 } from "uuid";

export default function TodoList() {
  let [todo, setTodo] = useState([{task:"sample task", id:uuidv4()}]);
  let [newtodo, setNewTodo] = useState("");

  let addnewtask = () => {
    setTodo([...todo,{task:newtodo, id:uuidv4()}]);
    setNewTodo("");
  };

  let updateTodoValue = (event) => {
    console.log(event.target.value);
    setNewTodo(event.target.value);
  };

  let deletetodo=(id)=>{
    setTodo(todo.filter((todo)=>todo.id!=id));
  }

  // let uppercase=
  return (
    <div>
      <input
        placeholder="Type your tasks"
        value={newtodo}
        onChange={updateTodoValue}
      />

      <button onClick={addnewtask}>Add a task</button>
      <hr />
      <ul>{
        todo.map((to) =>  (
            <ul key={to.id}>
              <span>{to.task}</span>
              <button onClick={()=>{ deletetodo(to.id)}}>Delete</button>
              <button></button>
              
            </ul>
            
           
            
       ))

        }
        
        </ul>
        <button> </button>
  
       
    </div>
  );
}
