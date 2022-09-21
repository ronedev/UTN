#Hacer un programa que simule una agenda de contactos. Crear un diccionario donde la clave sea el nombre del usuario y el valor sea el telefono, el programa tendra el siguiente menu de opciones

opcion = 0

contactos = {
    "Eduardo": 219432904,
    "Ricarda": 341231231
}

def addContact():
    name = input('Ingrese el nombre del contacto a agregar: ')
    tel = int(input('Ingrese el numero del contacto a agregar: '))
    contactos[name] = tel
    print('Contacto agregado correctamente')

def removeContact():
    print('Su lista de contactos actual:')
    print(contactos)
    name = input('Ingrese el nombre del contacto a eliminar: ')
    del contactos[name]
    print('Contacto eliminado correctamente')

def showContacts():
    print('Su lista de contactos actual:')
    print(contactos)

while(opcion != 4):
    print('¿Que desea hacer?')
    print('\n1.Nuevo contacto')
    print('\n2.Borrar contacto')
    print('\n3.Ver contactos existentes')
    print('\n4.Salir')
    opcion = int(input('Ingrese la opcion con la que desea proseguir: '))

    if(opcion == 1):
        addContact()
    elif(opcion == 2):
        removeContact()
    elif(opcion == 3):
        showContacts()
    elif(opcion == 4):
        print('Saliendo...')
        opcion = 4
    else:
        print('La opcion ingresada no conrresponde a un comando valido.')
        opcion = 4