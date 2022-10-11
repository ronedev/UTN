#Crear una funcion para calcular el total de un pago incluyendo un impusto aplicado (IVA)
#Formula = pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto / 100)
#Proporcione el pago sin impuesto: 1000
#Proporcione el monto del impuesto: 21%
#Pago con impuesto: xxxxxx

def calcularImpuesto(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
    return pago_total

print(calcularImpuesto(1000, 21))