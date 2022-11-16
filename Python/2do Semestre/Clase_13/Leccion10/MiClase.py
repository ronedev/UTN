class MiClase:
    #En cada objeto esta variable sera la misma
    variable_clase = 'Esta es mi variable de clase'

    def __init__(self, varible_instancia): #La variable de instancia recibe distintos valores segun su objeto
        self.variable_instancia = varible_instancia
    
    @staticmethod
    def metodo_estatico():
        print(MiClase.variable_clase)
    
    @classmethod
    def metodo_clase(cls):
        print(cls.variable_clase)

    def metodo_instancia(self):
        self.metodo_clase()
        self.metodo_estatico()
        print(self.variable_clase)
        print(self.variable_instancia)
    
print(MiClase.variable_clase)
miClase1 = MiClase('Esta es una variable de instancia')
print(miClase1.variable_instancia)
miClase2 = MiClase('Esta es otra variable de instancia, distinta a la anterior')
print(miClase2.variable_instancia)

MiClase.variable_clase_2 = 'Esta es mi variable de clase 2'
print(MiClase.variable_clase_2)
print(miClase1.variable_clase_2)
print(miClase2.variable_clase_2)

MiClase.metodo_estatico()

MiClase.metodo_clase()

miObjeto1 = MiClase('Variable instancia objeto1')
miObjeto1.metodo_clase()
miObjeto1.metodo_instancia()