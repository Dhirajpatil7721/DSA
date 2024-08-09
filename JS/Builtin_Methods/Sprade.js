let array1 = [1,2,3,4,5];
let array2 = [6,7,8,9];

let sprade = (a1,a2) => {
    let myarr = [];
// let ind=0;

for(i=0;i<a1.length;i++){
    myarr[myarr.length]=a1[i];
}
for(i=0;i<a2.length;i++){
    myarr[myarr.length]=a2[i];
}
console.log(myarr)
}

sprade(array1 , array2);
