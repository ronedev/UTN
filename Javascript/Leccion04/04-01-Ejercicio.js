//Ampliamos el uso de var, let y const
/*
Con var se puede reasignar en cualquier momento
esta forma parte del ambito global
Un error es que se pueda sobreescribir
*/

var nombre = 'Agustin'
nombre = 'Ricardo'
console.log(nombre)

function saludar(){
    var nombre = 'Sandra'
    console.log(nombre)
}
saludar()
console.log(nombre) //Aqui no lee el cambio hecho en la funcion

if(true){
    var edad = 38
    console.log(edad)
}
console.log(edad) // Aca si se asigna el valor que se le dio en el condicional

/*
let puede ser reasignada en cualquier momento 
la diferencia es que su ambito es de bloque
solo esta disponible dentor de un bloque de llaves
*/

function saludar2(){
    let nombre2 = 'Roberto'
    console.log(nombre2)
}
saludar2()
// console.log(nombre2)

if(true){
    let edad2 = 23
    console.log(edad2)
}
// console.log(edad2)

/*
    const se usa para valores constantes que no van a cambiar
*/

const añoNacimiento = 1999
console.log(añoNacimiento)
// añoNacimiento = 2015
// console.log(añoNacimiento)