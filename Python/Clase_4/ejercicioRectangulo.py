#Calculo de area y perimetro de un rectangulo

alto = int(input("Proporciona el alto del rectangulo: "))
ancho = int(input("Proporciona el ancho del rectangulo: "))

area = alto * ancho
perimetro = (alto + ancho) * 2

print(f'El resultado del area es: {area}')
print(f'El resultado del perimetro es: {perimetro}')