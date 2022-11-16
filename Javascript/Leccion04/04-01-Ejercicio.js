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

papa_vacaciones = false
papa_dia_de_descanso = true
if(papa_vacaciones || papa_dia_de_descanso){
    console.log("Puede ir al partido")
}else{
    console.log("No puede ir al partido")
}

//Operador ternario
let resultado = papa_dia_de_descanso || papa_vacaciones ? 'Puede ir al partido' : 'No puede ir al partido'
console.log(resultado)

let numero = 10
let resultado2 = numero % 2 === 0 ? 'El numero es Par' : 'El numero es impar'
console.log(resultado2)

//Convertir String a Number
let miNumero = '20'
console.log(typeof miNumero)
let edad2 = Number(miNumero)
console.log(edad2)
console.log(typeof edad2)

if(isNaN(edad2)){
    console.log("No contiene unicamente numeros")
}else{
    if(edad2 >= 18){
        console.log('Es Mayor de edad')
    }else{
        console.log('Es menor de edad')
    }    
}

let resultado3 = edad2 >= 18 ? "Es mayor de edad": "Es menor de edad"
console.log(resultado3)

//Funcion isNaN
