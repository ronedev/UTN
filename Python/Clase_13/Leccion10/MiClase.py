class MiClase:
    #En cada objeto esta variable sera la misma
    variable_clase = 'Esta es mi variable de clase'

    def __init__(self, varible_instancia): #La variable de instancia recibe distintos valores segun su objeto
        self.variable_instancia = varible_instancia
    
print(MiClase.variable_clase)
miClase1 = MiClase('Esta es una variable de instancia')
print(miClase1.variable_instancia)
miClase2 = MiClase('Esta es otra variable de instancia, distinta a la anterior')
print(miClase2.variable_instancia)