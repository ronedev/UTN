from FiguraGeometrica import FiguraGeometrica
from Color import Color

class Rectangulo(FiguraGeometrica, Color):
    def __init__(self, base, altura, color):
        FiguraGeometrica.__init__(self, base, altura)
        Color.__init__(self, color)

    def calcularArea(self):
        return self._alto * self._ancho
    
    def __str__(self):
        return f'Rectangulo: [ancho: {self._ancho}, alto: {self._alto}, color: {self._color}, area: {self.calcularArea()}]'