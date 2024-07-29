let array = [1, 2, 3, 4, 5, 6, 5, 7, 8, 9]


let remove = (arr, n) => {

    for (i = n; i < arr.length; i++) {

        //Shift the position
        arr[i] = arr[i + 1]

    }

    arr.length = arr.length - 1

    return arr
}




console.log(remove(array, 6))