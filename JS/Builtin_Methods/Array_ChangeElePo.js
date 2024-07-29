let array = [13, 8, 66, 7, 45, 9, 31]


// Shift the Position of the Element in array.

let Shifter = (po, val, arr) => {

    for (let i = arr.length - 1; i >= 0; i--) {

        if (i >= po) {

            arr[i + 1] = arr[i]

            if (i == po) {
                arr[i] = val
            }

        }

    }
    return arr;
}

console.log(Shifter(1, 14, array));