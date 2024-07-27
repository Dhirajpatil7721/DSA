
// function fact(num){

//     let result=num;

//     for(i=2;i<num;i++){

//         result=result * i

//     }
// return result
// }
// console.log(fact(5))


// function facto(num){
// // result=num;
// for(let i=num; i>=2; i--){

//     num=num*(i-1)
// }
// return num


// }
// console.log(facto(10));


function facto(num) {
    // let  result = num;
    if (num < 2) {
        
        console.log("Your Factorial is");

    }
    else {

        // facto(result = result * result - 1)
        facto(num * num - 1)
num--

    }
    
    
    console.log(num);
}
facto(5)


