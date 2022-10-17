class Persona:
    def __init__(self, name, surname, age, dni, id, *args, **kwargs):
        self.name = name
        self.surname = surname
        self.age = age
        self._dni = dni #Atributo encapsulado de manera sugerida
        self.__id = id #Atributo encapsulado, solamente puede ser utilizado dentro de la clase
        self.args = args
        self.kwargs =kwargs
    def mostrar_detalle(self):
        print(f'La clase Persona: name:{self.name}, surname: {self.surname}, {self._dni}, age: {self.age}, la direccion es {self.args}, los datos imporantes son {self.kwargs}')

persona1 = Persona('Reinaldo', 'Gomez',3214233241, '1321312312llll', 45)
print(persona1.name)
print(persona1.surname)
print(persona1.age)

persona2 = Persona('Ariel', 'Bentancud', 3413212412412, '132131312sasas', 40)
print(f'El objeto2 de la clase persona: {persona2.name} {persona2.surname} {persona2.age}')

persona1.surname = 'Vera'
persona1.name = 'Agustin'
persona1.age = 23
print(f'El objeto1 de la clase persona: {persona1.name} {persona1.surname} {persona1.age}')

persona1.mostrar_detalle()
persona2.mostrar_detalle()

persona1.telefono = '2604519284'
print(f'El telefono de {persona1.name} es {persona1.telefono}')

persona3 = Persona('Agustin', 'Vera', 22,414123123,'1321312lkkkk', 'Telefono', '2532521352', 'Calle Lopez', 340, 'Manzana', 77, 'Casa', 55, Altura=1.8, Peso=120, CFav='Violeta', Auto='Fiat', Modelo='Argo')
persona3.mostrar_detalle();

