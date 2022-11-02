from FiguraGeometrica import FiguraGeometrica
from Color import Color

class Cuadrado(FiguraGeometrica, Color):
    def __init__(self, lado, color):
        FiguraGeometrica.__init__(self, lado, lado)
        Color.__init__(self, color)

    def calcularArea(self):
        return self._alto * self._ancho
    
    def __str__(self):
        return f'Cuadrado: [ancho: {self._ancho}, alto: {self._alto}, color: {self._color}, area: {self.calcularArea()}]'