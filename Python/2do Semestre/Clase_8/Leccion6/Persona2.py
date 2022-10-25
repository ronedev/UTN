class Persona2:
    def __init__(self, nombre, apellido, edad):
        self._nombre = nombre
        self._apellido = apellido
        self._edad = edad
    
    def mostrarDetalle(self):
        return f'Los datos a mostrar son: {self._nombre} {self._apellido} {self._edad}'
    
    @property #Decorador
    def nombre(self): #metodo getter
        print('Usando el metodo get')
        return self._nombre
    
    @nombre.setter
    def nombre(self, nombre): #metodo setter
        print('Usando el metodo set')
        self._nombre = nombre

    @property #Decorador
    def apellido(self): #metodo getter
        print('Usando el metodo get')
        return self._apellido
    
    @apellido.setter
    def apellido(self, apellido): #metodo setter
        print('Usando el metodo set')
        self._apellido = apellido

    @property #Decorador
    def edad(self): #metodo getter
        print('Usando el metodo get')
        return self._edad
    
    def __del__(self):
        print(f'Persona2: {self._nombre} {self._apellido} {self._edad}')

if(__name__ == '__main__'):
    persona1 = Persona2('Agustin', 'Vera', 23)
    print(persona1.nombre) #Llamamos al metodo getter
    persona1.nombre = 'Gaston' #Llamamos al metodo setter
    print(persona1.nombre)
    print(persona1.mostrarDetalle())
    #Atributo read-only seria en este caso edad que tiene metodo getter pero no setter
    print(persona1._edad)

    #Crear tres objetos mas y modificar atributos con los metodos
    persona2 = Persona2('Juan', 'Garcia', 45)
    persona3 = Persona2('Lorena', 'Rivas', 35)
    persona4 = Persona2('Ana', 'Perez', 15)

    print(persona2.mostrarDetalle())
    persona2.nombre = 'Juan Gabriel'
    print(persona2.mostrarDetalle())

    print(persona3.mostrarDetalle())
    persona3.apellido = 'Rodriguez'
    print(persona3.mostrarDetalle())

    print(persona4.mostrarDetalle())
    persona4.nombre = 'Juana'
    persona4.apellido = 'Lopez'
    print(persona4.mostrarDetalle())