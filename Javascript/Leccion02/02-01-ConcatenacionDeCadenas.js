var nombre = "Agustin"
var apellido = "Vera"
var nombreCompleto = nombre + ' ' + apellido

console.log(nombreCompleto);
var nombreCompleto2 = 'Ariel' + ' ' + 'Bentancud'
console.log(nombreCompleto2);

var juntos = nombre + 234
console.log(juntos)
juntos = nombre + 78 + 17
console.log(juntos);
juntos = 78 + 17 + nombre
console.log(juntos)
juntos = 78 + (17 + nombre)
console.log(juntos)

let x, y //Se pueden crear varias variables en la misma linea
x = 17, y = 21 //Se puede hacer asignacion de varias variables en la misma linea
let z = x + y //Se asigna el valor de la operacion
console.log('z: ',z)

let _1num = 16 //No usar numeros para iniciar nombre de variable
let rompiendo = 'break' //no usar palabras reservadas como nombre de variable

console.log(_1num)
console.log(rompiendo)