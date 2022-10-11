#Realizar dos funciones para convertir de grados Celsius a Fahrenheit y viceversa

def celsiusAFahrenheit(celsius):
    return (celsius * (9/5)) + 32

def fahrenheitACelsius(fahrenheit):
    return (fahrenheit - 32) * (5/9)

print(fahrenheitACelsius(25))
print(celsiusAFahrenheit(-3.88889))