#Imprimir numeros de manera descendente usando funciones recursivas. Puede ser cualqueir valor positivo, por ejemplo, si pasamos el valor de 5 debe imprimir: 5, 4, 3, 2, 1. En caso de ser el numero 3 debe imprimir: 3, 2, 1. Si se ingresan numeros negativos no imprime nada

def numerosDescentendes(num):
    if(num <= 0):
        return
    else:
        print(num)  
        return numerosDescentendes(num - 1)

numerosDescentendes(3)