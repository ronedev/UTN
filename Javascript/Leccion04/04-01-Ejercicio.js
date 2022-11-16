//Ejercicio 1: Calcular  estacion del año

let mes = 6

if( mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano"
}else if( mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño"
}else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno"
}else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera"
}else{
    console.log("Mes incorrecto")
}

switch(mes){
    case 1: case 2: case 12:
        estacion = "Verano"
        break
    case 3: case 4: case 5:
        estacion = "Otoño"
        break
    case 6: case 7: case 8:
        estacion = "Invierno"
        break
    case 9: case 10: case 11:
        estacion = "Verano"
        break
    default:
        console.log("Mes incorrecto")
}

console.log(estacion)

//Ejercicio 2: Horas del dia
let hora_actual = 23
if(hora_actual > 0 &&  hora_actual < 7){
    console.log("Estoy mimiendo")
}else if(hora_actual >= 7 && hora_actual < 8){
    console.log("Despertando y desayunando")
}else if(hora_actual >= 8 && hora_actual <= 12.5){
    console.log("Trabajando")
}else if(hora_actual > 12.5 && hora_actual < 14){
    console.log("Comiendo y lavando platos")
}else if(hora_actual > 14 && hora_actual < 16){
    console.log("Descanso")
}else if(hora_actual >= 16 && hora_actual <=19){
    console.log("Trabajando")
}else if(hora_actual > 19 && hora_actual <= 22){
    console.log("Cursando")
}else if(hora_actual > 22 && hora_actual < 24){
    console.log("Cenando y ocio")
}else{
    console.log("Hora incorrecta")
}