let array = [1, 2, 3, 2, 4, 5, 6, 7, 8, 9, 9, 4, 5, 7, 6, 2, 2, 5, 6, 7, 9, 4, 3, 6, 7, 8]
//iNcOMPLeT
let uniarray = (array) => {


    let uni = [];

    for (let i = 0; i < array.length; i++) {
    let flag = false;

        for (let j = 0; j < uni.length; j++) {

            if (uni[j] == array[i]) {
                flag = true;
                break;
            }

        }
        if (!flag) {
            uni.push(array[i]);
        }

    }
    return uni;
}
console.log(uniarray(array));


