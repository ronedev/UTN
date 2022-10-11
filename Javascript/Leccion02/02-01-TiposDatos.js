//Tipos de Datos en Javascript
/*
La sintaxis en lo que es comentarios es muy similar a la de Java
*/

var nombre = "Agustin" //Tipo string
console.log(typeof nombre)
nombre = 7
console.log(typeof nombre);

var num = 16 //Tipo numerico
console.log(num);

var objeto = {
    name: 'Ariel',
    surname: 'Bentancud'
}
console.log(objeto)

//Tipo de dato boolean
var bandera = true
console.log(bandera)

//Tipo de dato funcion
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de dato symbol
var simbolo = Symbol("Mi simbolo")
console.log(simbolo)

//Tipo de dato clase
class Persona{
    constructor(name, surname){
        this.name = name
        this.surname = surname
    }
}

console.log(new Persona('Agustin', 'Vera'));