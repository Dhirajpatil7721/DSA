let array = [4 ,1, 2, 3, 4, 5, 6, 7, 8, 9]

// remove the first value and return remove array

function Shifter (arr){
    
let i=0;
const peak = arr[i]

while(i<arr.length){
        
    arr[i]=arr[i+1]
    i++
    
}
arr.length=arr.length-1
return peak
}

console.log(Shifter(array))
console.log(array)




