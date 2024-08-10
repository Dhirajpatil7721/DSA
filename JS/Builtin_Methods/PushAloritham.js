let array = [1, 2, 3, 4, 5, 6, 7, 8]

let ad = 9

function push(arr, item) {

    let myarr = arr.length;

    arr[myarr] = item
    return (arr);
}

console.log(push(array, ad))

