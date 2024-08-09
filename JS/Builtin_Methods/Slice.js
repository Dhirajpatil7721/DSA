let array = [2, 5, 7, 8, 9, 1, 2, 3, 4, 6, 4, 2, 3, 4, 5];

let Sliceindex = (arr, n1, n2) => {
  let myarr = [];
  
  if(n2==undefined){
      n2=arr.length;
  }
  for (let i = n1; i < n2; i++) {
    myarr[myarr.length] = arr[i]; // Adds the element at the next available index
  }
  console.log(myarr);
}

Sliceindex(array, 5);
