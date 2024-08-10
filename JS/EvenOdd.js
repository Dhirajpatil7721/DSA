let num = [1, 2, 3, 2, 4, 5, 6, 7, 8, 9, 9, 4, 5, 7, 6, 2, 2, 5, 3]
let ev = []
let odd = []

// for(i=0;i<num.length; i++){

// if(num[i] % 2 === 0 ){
// ev.push(num[i])

// }
// else{
//     odd.push(num[i])
// }
// }
// console.log(ev);
// console.log(odd);

function cal(ar) {

    for (i = 0; i < ar.length; i++) {

        if (ar[i] % 2 === 0) {
            ev.push(ar[i])
        }
        else {
            odd.push(ar[i])
        }


    }
    // return{ 
    // "Even =" : {ev},  
    // "odd=" : {odd}
    // }

    return (ev);
    // return (odd);
}

console.log(cal(num))