dividendo = int(input("Ingrese el numero a dividir: "))
divisor = int(input("Ingrese el numero que dividira: "))

aux = dividendo
cociente = 0

def contador():
    global cociente
    cociente += 1

def division(dividendo, divisor):
    while divisor == 0:
        print("No se puede divir entre 0")
        divisor = int(input("Ingrese el numero que dividira: "))
        
    while dividendo >= divisor:
        dividendo -= divisor
        contador()

    return dividendo, divisor

residuo, divisor = division(dividendo, divisor)

print(f"La division por restas sucesivas de {aux} entre {divisor} es: {cociente}")
print(f"El residuo es: {residuo}")