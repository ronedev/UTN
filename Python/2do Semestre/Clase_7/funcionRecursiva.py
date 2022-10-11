from symbol import factor


def factorial(num):
    if num == 1:
        return 1
    else:
        return num * factorial(num-1)

print(f'El factorial del numero 5 es: {factorial(5)}')