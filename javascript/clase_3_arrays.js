const arr1 = [1, 4, 3, 10, 6, 7, 20, -10, 25];
const arr2 = ['Lunes', 'Martes', 'Miércoles', 'Jueves', 'Viernes'];

console.log(arr1[5]);
console.log(arr2[1]);

// Buscar todos los mayores a X
function mayoresQue(x, arr) {
    const res = [];
    for(i=0; i<arr.length; i++) {
        if(arr[i] > x) {
            res.push(arr[i]);
        }
    }
    return res;
}

function mayoresQue2(x, arr) {
    return arr.filter(a => a>x);
}

function buscarMayorQue(x, arr) {
    return arr.find(a => a>x);
}

function buscarPosicionMayorQue(x, arr) {
    return arr.findIndex(a => a>x);
}

function alCubo(arr) {
    return arr.map(a => a**3);
}

function suma(arr) {
    return arr.reduce((suma, a) => suma += a, 0);
}

console.log(mayoresQue(5, arr1));

console.log(mayoresQue2(5, arr1));

console.log(buscarMayorQue(5, arr1));
console.log(buscarPosicionMayorQue(5, arr1));
console.log(alCubo(arr1));
console.log(suma(arr1));

// console.log(arr1.sort((a, b) => b-a))

for(let v of arr2) {
    console.log(v);
}

// condición?verdadero:false;

console.log(1 > 2?'1 Mayor a 2': '1 Menor a 2');

console.log(arr1);
function mayorQueRec(x, arr, pos) {
    if(pos == undefined) {
        pos = 0;
    }
    if(arr[pos] > x) {
        return arr[pos];
    }
    return mayorQueRec(x, arr, pos+1);
}

console.log(mayorQueRec(5, arr1));