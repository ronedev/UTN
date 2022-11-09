from abc import ABC, abstractmethod
#ABC significa Abstract Base Class, convierte una clase a abstracta
class FiguraGeometrica(ABC):
    def __init__(self, ancho, alto):
        if self._validar_valores(alto):
            self._alto = alto
        else:
            self._alto = 0
            print(f'{alto} es un valor erroneo')
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            self._ancho = 0
            print(f'{alto} es un valor erroneo')

    @property
    def alto(self):
        return self._alto
    
    @alto.setter
    def alto(self, alto):
        if self._validar_valores(alto):
            self._alto = alto
        else:
            print(f'Valor erroneo para el alto: {alto}')

    @property
    def ancho(self):
        return self._ancho
    
    @ancho.setter
    def ancho(self, ancho):
        if self._validar_valores(ancho):
            self._ancho = ancho
        else:
            print(f'Valor erroneo para el ancho: {ancho}')
    
    @abstractmethod
    def calcularArea(self):
        pass
    
    def __str__(self):
        return f'FiguraGeometrica: [ancho: {self._ancho}, alto: {self._alto}]'
    
    def _validar_valores(self, valor):
        return True if valor < 10 and valor > 0 else False
