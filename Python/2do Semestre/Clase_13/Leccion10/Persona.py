class Persona:
    contador_personas = 0 #Variable de clase

    @classmethod
    def generar_siguiente_valor(cls):
        cls.contador_personas += 1
        return cls.contador_personas

    def __init__(self, nombre, edad):
        self.idPersona = Persona.generar_siguiente_valor()
        self.nombre = nombre
        self.edad = edad
    
    def __str__(self):
        return f'Persona: [id: {self.idPersona}, nombre: {self.nombre}, edad: {self.edad}]'
    

persona1 = Persona('Agustin', 23)
print(persona1)
persona2 = Persona('Roberto', 65)
print(persona2)
persona3 = Persona('Sandra', 54)
print(persona3)

print(f'Valor contador personas: {Persona.contador_personas}')