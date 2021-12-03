var variable;


function test(variable, b) {
    return variable + b;
}



const variable_const = 100;

let variable_let = 200;


const mensaje = 'Hola a Todos!!!'

console.log(mensaje);


console.log(variable);
console.log(variable_const);
console.log(variable_let);

variable_let = test(variable_const, variable_let);

console.log(variable_let);


variable = 500;
console.log(variable);

variable_let = 1000;
console.log(variable_let);

// variable_const = 20;
// console.log(variable_const);

ejemploVariables(0, 10);

function ejemploVariables(var1, var2) {
    console.log(var1, var2);
    let i= 0;
    for(; i<var2; i++) {
        console.log('Indice', i);
    }

    console.log('Final', i);
}

variable = 10;

const fn = (a, b) => {
    return a**b;
}

console.log(fn(10, 3));

// switch(varX) {
//     case 'UNO':
//         //...
//         break;
//     case 2:
//         //...
//         break;
//     default:
//         //....
// }


function ejemploCondiciones(var1, var2) {
    const arr = [];
    if(typeof var1 == 'number') {
        for(let i=0; i < var1; i++) {
            if(typeof var2 == 'number') {
                for(let j=0; j<var2; j++) {
                    arr.push(i**j);
                }
            } else if(typeof var2 == 'string') {
                arr.push(var2 + '_' + i)
            } else {
                console.log('ERROR');
            }
        }
    } else if(typeof var1 == 'string') {
        return var1 + ' ' + var2;
    } else {
        console.log('ERROR');
    }
    return arr;
}


console.log(ejemploCondiciones(10, 5));
console.log(ejemploCondiciones(10, 'Hola'));
console.log(ejemploCondiciones('Bye', 5));
console.log(ejemploCondiciones('Hola', 'A Todos'));
console.log(ejemploCondiciones(new Date(), 5));


function esPar(numero) {
    if(numero % 2 == 0){
        return true;
    } else {
        return false;
    }
}

function esPar2(nummero) {
    return numero%2 == 0;
}

function esImpar(numero) {
    return numero%2 != 0;
}

function imprimirValorArray(arreglo) {
    console.log(arreglo.length);
    for(let i=0; i < arreglo.length; i++){
        console.log(arreglo[i]);
    }
}

imprimirValorArray([2, 'Uno', new Date()]);