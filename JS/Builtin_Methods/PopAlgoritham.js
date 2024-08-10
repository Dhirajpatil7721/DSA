let array = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

function pop (arr) {
    let ln = arr.length - 1
    let newarr = []

    for (let i = 0; i < ln; i++) {


        newarr[i] = arr[i]

    }
    return newarr

}
console.log(pop(array));


