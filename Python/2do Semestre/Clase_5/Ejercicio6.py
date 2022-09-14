#Mostrar una frase sin espacios y contar su longitud, Hacer un programa donde el usuario ingrese una frase, se le deolvera la misma frase pero sin espacios en blaco, y ademas un contador de cuantos caracteres tiene la frase sin contar los espacios. Por ejemplo frase: vivir por siempre en paz, frase final: vivirporsiempreenpaz caracteres:20

frase = input('Ingrese su frase: ')

longitud = 0
fraseFinal = ''
for caracter in frase:
    if(caracter != ' '):
        fraseFinal = fraseFinal + caracter
        longitud = longitud + 1

print(fraseFinal)
print(longitud)
    