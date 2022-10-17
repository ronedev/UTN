class Rectangulo:
    """
    Debe tener 2 atributos altura y basee y un metodo que calcule el area
    La base y altura debe ser ingresada por el usuario y los objetos deben ser 3
    """
    def __init__(self, base, altura):
        self.base = base
        self.altura = altura
    
    def calcularArea(self):
        return self.base * self.altura


base = int(input('Ingrese la base del rectangulo: '))
altura = int(input('Ingrese la altura del rectangulo: '))
rectangulo1 = Rectangulo(base, altura)
print(f'El area del rectangulo es: {rectangulo1.calcularArea()}')