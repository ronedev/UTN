from Cuadrado import Cuadrado
from Rectangulo import Rectangulo

cuadrado1 = Cuadrado(5, 'rojo')
print(cuadrado1.ancho)
print(cuadrado1.alto)
print(cuadrado1)
print(f'El area del cuadrado 1 es: {cuadrado1.calcularArea()}')

#Test rectangulo
rectangulo1 = Rectangulo(5, 10, 'verde')
print(rectangulo1.ancho)
print(rectangulo1.alto)
print(rectangulo1)
print(f'El area del rectangulo 1 es: {rectangulo1.calcularArea()}')