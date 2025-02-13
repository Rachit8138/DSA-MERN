const array=(n)=>{
    let total=0;
    for (let i=0;i<n.length;i++){
        total+=n[i];
    }
    let average=total/n.length;
    console.log(average);

}

array([3,4,5,6,7])

const even_or_not =(n)=>n%2==0;

console.log( even_or_not(7));


// const object ={
//     message:'Hello, World!',

//     logMessage(){
//         console.log(this.message);
//     }
// };
// setTimeout(object.logMessage,1000);

let length =4;
function callback(){
    console.log(this.length);
}

const obj ={
    length:5,
    method(callback){
        callback();
    },
};

obj.method(callback,1,2);