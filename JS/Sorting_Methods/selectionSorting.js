let arr = [55, 23, 4, 7, 58, 69, 75, 33, 14]

//In selection sorting i is started from 0 ,and  loop itrate 1 value each elements in array and swap the value.

for (let i = 0; i < arr.length; i++) {

    for (let j = i + 1; j < arr.length; j++) {

        if (arr[i] > arr[j]) {
            [arr[i], arr[j]] = [arr[j], arr[i]]  //Destructuring Methos or Swaping
        }
    }
}

console.log(arr);


