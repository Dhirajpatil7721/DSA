let array = [13, 8, 66, 7, 45, 9, 31]

//In Insertion Sorting i starts from 1 index then check previous value from i th place and shifing the index .
let sorted = (arr) => {

    for (i = 1; i < arr.length; i++) {
        let key = arr[i]
        j = i - 1
        while (arr[j] > key && j >= 0) {
            arr[j + 1] = arr[j]            //Destructuring Methos or Swaping
            j--
        }
        arr[j + 1] = key

    }
    return arr
}

console.log(sorted(array))

















