let array = [2, 85, 76, 39, 52, 16, 52, 78, 14, 3, 87, 50, 0, 55, 74, 79, 71, 23, 14, 56, 17]

// step 1= create function
//         mearge(arr,l,r)

// step 2= check the conduition
//         if(l<r)

// step 3= Divide and Sort  Start to Mid
//         mergesort(arr,l,mid)

// step 4= Divide and Sort  Mid to  End
//         meregesort(arr,mid.r)

// step 5= Join the both array
//         mrege(arr,l,mid,r)


let size = array.length;
// console.log("Size of array is=", size);

let merge = (arr, l, r) => {


    let mid = Math.floor((l + r) / 2)
    // console.log("middle value of the array is =", mid);

    let midpluse = mid + 1;
    // console.log("middle pluse 1 is =", midpluse);



    if (l < r) {
        // console.log("i am in 1 if");



        // first Merge Sort
        let mergesort = (arr, l, mid) => {
            // console.log("i am in 1 merge");

            if (l < mid) {
                
                
                
            }

            // while(l<mid){

            //     l++
            // }

        }
        mergesort(arr, l, mid)




        // second Merge Sort     
        mergesort = (arr, midpluse, r) => {

            if (midpluse < r) {
                // console.log("im in 3 if");
            }

        }
        mergesort(arr, midpluse, r)

        let merge = () => {


        }




    }


}

merge(array, 0, size)

