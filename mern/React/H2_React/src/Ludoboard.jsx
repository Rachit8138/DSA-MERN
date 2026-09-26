import {useState} from "react"
export default function LudoBoard(){
    let [moves,setMoves]=useState({blue:0,yellow:0,green:0,red:0});

    let[arr, SetArr] = useState(["no moves"])
    let updateblue=()=>{
        console.log(moves.blue);
        setMoves((preMoves)=>{
            return {...preMoves, blue:moves.blue+1};
        });

        SetArr([arr.at.apply.arr,"yellow moves"])
    }
    return(
        <div className="board"> 
            <p>{arr}</p>
            <p>Blue moves: {moves.blue}</p>
            <button  style={{ backgroundColor:"blue"}} onClick={updateblue} >+1</button>
            <p>Yellow moves: {moves.yellow}</p>
            <button style={{ backgroundColor:"yellow"}}>+1</button>
            <p>Green moves: {moves.green}</p>
            <button style={{ backgroundColor:"green"}}>+1</button>
            <p>Red moves: {moves.red}</p>
            <button style={{ backgroundColor:"red"}}>+1</button>
        </div>
        // <button></button>
    )
}