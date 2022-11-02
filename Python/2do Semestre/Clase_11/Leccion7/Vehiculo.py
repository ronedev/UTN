class Vehiculo:
    def __init__(self, color, ruedas):
        self._color = color
        self._ruedas = ruedas
    
    def __str__(self):
        return f'Vehiculo: [color: {self._color}, ruedas: {self._ruedas}]'

class Auto(Vehiculo):
    def __init__(self, color, ruedas, velocidad):
        super().__init__(color, ruedas)
        self._velocidad = velocidad
    
    def __str__(self):
        return f'Auto: [velocidad: {self._velocidad}], {super().__str__()}'

class Bicicleta(Vehiculo):
    def __init__(self, color, ruedas, tipo):
        super().__init__(color, ruedas)
        self._tipo = tipo
    
    def __str__(self):
        return f'Bicicleta: [tipo: {self._tipo}], {super().__str__()}'

vehiculo = Vehiculo('rojo', 8)
print(vehiculo)
auto = Auto('amarillo', 4, 150)
print(auto)
bici = Bicicleta('gris', 2, 'BMX')
print(bici)