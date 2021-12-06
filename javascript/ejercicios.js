function sigma(n) {
    let sigma = 0;
    for(let i = 1; i<=n; i++){
        sigma += i;
    }
    return sigma;
}


console.log(sigma(10));


function fibonacci(n) {
    const serie = [1,1];
    if(n > 2) {
        for(let i = 2; i < n; i++){
            serie.push(serie[i-2] + serie[i-1]);
        }
    } else {
        return Error('El indice es demasiado pequeño')
    }
    return serie;
}

console.log(fibonacci(20));


// & = and 
// | = or

// && = and cortocircuito
// || = or cortocircuito

// ! = negación


// if( 1 > 0 || 0 > 1) {
//     true
// }


// if(10==5 || 3 < 2 || 4<5 || 10>20 || 90<100) {
//     true
// }


// if(10==5 && 3<2 && 4<5 && 10>20 && 90<100){
//     false
// }

// (10 == 5 || 20>10) && 5*5==25 && 10/2==5 && (20/20==3 || 51<51) = false
//         T                T           T               F

// true && true = true

// true && false = false

// false && true = false

// false && false = false


console.log(10 != 5 ^ 20>100);


function arraySegundoMayor(array){ 
    array = array.sort((a, b) => {
        return b-a;
    });
    console.log(array); 
    segMayor = array[1]; 
    return segMayor; 
} 

console.log(arraySegundoMayor([3,8,22,9,46,7])) 