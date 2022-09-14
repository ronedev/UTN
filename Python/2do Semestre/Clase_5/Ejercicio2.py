#Factorial de un numero positivo, hacer un programa para calcular el factorial de un numero positivo

num = int(input('Digite un numero POSITIVO: '))
while num < 0:
    num = int(input('El numero debe ser positivo, intentelo nuevamente: '))

factorial = 1
for i in range(1, num + 1):
    factorial = factorial * i

print(f"El factorial del numero ", num, " es: ", factorial)