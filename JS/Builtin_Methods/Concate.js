let array1 = [1,2,3,4,5];
let array2 = [6,7,8,9];
let array3=[10 ,11,12 ];

let Concate = (a1,a2,a3) => {
  

for(i=0;i<a2.length;i++){
    a1[a1.length]=a2[i];
}
for(i=0;i<a3.length;i++){
    a1[a1.length]=a3[i];
}
console.log(a1)
}

Concate(array1 , array2,array3);
