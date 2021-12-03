class Persona {
    constructor(nombre, apellido, edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}

const objeto = {
    nombre: 'Juan',
    apellido: 'Soto',
    edad: 28
}

const persona1 = new Persona('Maria', 'Gonzalez', 17);

const persona2 = new Persona('Pedro', 'Jara', 54);

console.log(objeto.nombre);

objeto.nombre = 'Jonny';

console.log(objeto.nombre);

console.log(persona1.nombre);

console.log(objeto instanceof Persona);
console.log(persona1 instanceof Persona);
console.log(persona2 instanceof Persona);

const arr = [objeto, persona1, persona2];

for(const o of arr) {
    console.log(o.nombre + ' ' + o.apellido);
}


const auto = {
    marca: 'Toyota',
    modelo: 'Yaris',
    color: 'gris',
    anio: '2000',
    atributos: {
        alzavidrios: true,
        aireAcondicionado: false,
        radio: true
    }

}

console.log('Tiene alzavidrios', auto.atributos.alzavidrios);