// Callback hell 
/* 
if you need the condition where searching the username takes 2s and then from that checking the password
takes next 2s then simulate this then 
*/

const getdata = (data)=>{
    setTimeout(()=>{
        console.log("data",data);
    },2000);
}   
// this will give you the output at once like 2s all 3 output we need it in 2s, 4s, 6s 
getdata(1);
getdata(2);
getdata(3);

