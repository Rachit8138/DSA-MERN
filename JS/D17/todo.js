let todo =[];

while(true){
    let req=prompt("please enter your choice");

    if(req=="quit"){
        console.log("quitiing app");
        break;
    }

    if(req=="list"){
        console.log("-----------------");
        for(let i=0; i<=todo.length; i++){
            console.log(i, todo[i]);
        }
        console.log("-----------------");
    }else if(req=="add"){
        task=prompt("please enter the task you want to add");
        todo.push(task);
        console.log("task added");
    } else if(req=="delete"){
        task=prompt("please enter the task you want to delete");
        todo.splice(task,1);
        console.log("task deleted");
    } else {
        console.log("wrong request");
    }

}