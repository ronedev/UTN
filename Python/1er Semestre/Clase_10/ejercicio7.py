#Dada las horas trabajadas de 5 personas y la tarifa de pago, calcular el salario y la sumatoria de todos los salarios

i = 1
sumatoriaSalarios = 0

while i <= 5:
    print(f'Salario del empleado {i}: ')

    horas = float(input('Digite las horas trabajadas: '))

    tarifa = float(input('Digite la tarifa por hora: '))

    salario = horas * tarifa

    sumatoriaSalarios += salario

    print(f'El salario del empleado {i} es: {salario}')

    i += 1

print(f'La suma de todos los salarios es: {sumatoriaSalarios}')