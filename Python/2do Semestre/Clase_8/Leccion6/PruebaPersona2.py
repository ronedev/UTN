from Persona2 import Persona2

print('Creacion de Objetos'.center(50, '-'))
if (__name__ == '__main__'):
    persona1 = Persona2('Ariel', 'Bentancud', 41)
    print(persona1.mostrarDetalle())

    print(__name__)

print('Eliminacion de Objetos'.center(50, '-'))
del persona1