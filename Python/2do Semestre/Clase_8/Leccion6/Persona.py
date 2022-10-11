class Persona:
    def __init__(self, name, surname, age):
        self.name = name
        self.surname = surname
        self.age = age
    def mostrar_detalle(self):
        print(f'Persona: name:{self.name}, surname: {self.surname}, age: {self.age}')

persona1 = Persona('Reinaldo', 'Gomez', 45)
print(persona1.name)
print(persona1.surname)
print(persona1.age)

persona2 = Persona('Ariel', 'Bentancud', 40)
print(f'El objeto2 de la clase persona: {persona2.name} {persona2.surname} {persona2.age}')

persona1.surname = 'Vera'
persona1.name = 'Agustin'
persona1.age = 23
print(f'El objeto1 de la clase persona: {persona1.name} {persona1.surname} {persona1.age}')

persona1.mostrar_detalle()
persona2.mostrar_detalle()