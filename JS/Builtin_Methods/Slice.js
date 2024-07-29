let array=[2,5,7,8,9,1,2,3,4,6,4,2,3,4,5]


let Sliceindex=(arr,n1,n2)=>{
let myarr =[]
    for(i=n1;i<=n2;i++){
        
      myarr.push(arr[i])
        
    }
    console.log(myarr)

}

Sliceindex(array,5,8) 