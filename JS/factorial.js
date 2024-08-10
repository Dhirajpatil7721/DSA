
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
    if (num < 2) {
        console.log("Your Factorial is 1"); // Base case: factorial of 1 or 0 is 1
        return 1;
    } else {
        return num * facto(num - 1); // Recursive case: num * factorial of num-1
    }
}

console.log(facto(5)); // Output: 120



