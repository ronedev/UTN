#La tarea consiste en ingresar elementos al diccionario llamado seleccionArgentina, lo elementos a ingresar deben ser como mínimo 4, estos elementos son los jugadores con su número de camiseta, nombre, apellido, edad, altura, precio y posición de juego, por supuesto ver el video anterior.

seleccionArgentina = {
    10: {
        'Nombre': 'Lionel Messi',
        'Edad': 35,
        'Altura': 1.70,
        'Precio': '50 Millones',
        'Posicion': 'Extremo Derecho'
    },
    22: {
        'Nombre': 'Lautaro Martinez',
        'Edad': 25,
        'Altura': 1.74,
        'Precio': '106 Millones',
        'Posicion': 'Delantero Central'
    },
    7: {
        'Nombre': 'Rodrigo De Paul',
        'Edad': 28,
        'Altura': 1.80,
        'Precio': '40 Millones',
        'Posicion': 'Mediocentro'
    },
    23: {
        'Nombre': 'Damian Emiliano Martinez',
        'Edad': 30,
        'Altura': 1.95,
        'Precio': '21 Millones',
        'Posicion': 'Arquero'
    },
    9: {
        'Nombre': 'Julian Alvarez',
        'Edad': 22,
        'Altura': 1.73,
        'Precio': '51 Millones',
        'Posicion': 'Delantero Central'
    },
    11: {
        'Nombre': 'Angel Di Maria',
        'Edad': 34,
        'Altura': 1.80,
        'Precio': '70 Millones',
        'Posicion': 'Mediocentro'
    },
    24: {
        'Nombre': 'Paulo Dybala',
        'Edad': 28,
        'Altura': 1.77,
        'Precio': '35 Millones',
        'Posicion': 'Mediapunta'
    },
    13: {
        'Nombre': 'Cristian Gabriel Romero',
        'Edad': 24,
        'Altura': 1.88,
        'Precio': '50 Millones',
        'Posicion': 'Defensa Central'
    }
}

for key, value in seleccionArgentina.items():
    print(key, value)
