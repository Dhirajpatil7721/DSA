// Bubble Sorting
let arr = [54, 88, 6, 4, 755, 33, 14, 99, 58]
//In Bubble sorting i also strats from 0 and it loop itrate nerest firts vlu ( Tow value )  and swap the value.
function bsort() {
    for (let i = 0; i < arr.length; i++) {
        for (let j = 0; j < arr.length; j++) {

            if (arr[j] > arr[j + 1]) {
                [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]]     //Destructuring Methos or Swaping
            }
        }
    }
    console.log(arr)
}
bsort()






