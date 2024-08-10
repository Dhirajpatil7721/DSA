// let array = [2, 85, 76, 39, 52, 16, 52, 78, 14, 3, 87, 50, 0, 55, 74, 79, 71, 23, 14, 56, 17]

// // step 1= create function
// //         mearge(arr,l,r)

// // step 2= check the conduition
// //         if(l<r)

// // step 3= Divide and Sort  Start to Mid
// //         mergesort(arr,l,mid)

// // step 4= Divide and Sort  Mid to  End
// //         meregesort(arr,mid.r)

// // step 5= Join the both array
// //         mrege(arr,l,mid,r)


// let size = array.length;
// // console.log("Size of array is=", size);

// let merge = (arr, l, r) => {


//     let mid = Math.floor((l + r) / 2)
//     // console.log("middle value of the array is =", mid);

//     let midpluse = mid + 1;
//     // console.log("middle pluse 1 is =", midpluse);





// }

// merge(array, 0, size)


let array = [20, 18, 15, 14, 2, 1, 7, 8, 64, 23, 89, 1, 0]

function MergeSort(arr) {

    // this is slice function------------------------------------
    function Sliceing(arr, n1, n2) {
        let myarr = [];

        if (n2 == undefined) {
            n2 = arr.length;
        }
        for (let i = n1; i < n2; i++) {
            myarr[myarr.length] = arr[i]; // Adds the element at the next available index
        }
        return (myarr);
    }
    // this is slice function End------------------------------------

    // this is push function ------------------------------------

    function pusher(arr, item) {

        let myarr = arr.length;

        arr[myarr] = item
        return arr;
    }
    // this is push function End------------------------------------

    // this is Concate function ------------------------------------

    function Concated(a1, a2, a3) {

        for (i = 0; i < a2.length; i++) {
            a1[a1.length] = a2[i];
        }
        for (i = 0; i < a3.length; i++) {
            a1[a1.length] = a3[i];
        }
        return (a1)
    }
    // this is Concate function End------------------------------------





    if (arr.length < 2) {
        return arr;
    }

    let mid = Math.floor(arr.length / 2);
    let left = Sliceing(arr, 0, mid);
    let right = Sliceing(arr, mid);

    return Merge(MergeSort(left), MergeSort(right));


    function Merge(left, right) {
        const sort = [];
        while (left.length && right.length) {

            if (left[0] < right[0]) {
                pusher(sort, left);
            }
            else {
                pusher(sort, right);
            }

        }

        return Concated(sort, left, right)
    }
}

console.log(MergeSort(array))

