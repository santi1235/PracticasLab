
def potenciadedos():
    while True:
        numero = int(input("Introduce un numero positivo: "))
        if numero > 0:
            break
        else:
            print("Por favor, introduce un numero positivo")
    potencia = 1
    exponente = 0

    while potencia*2 <= numero:
        potencia *= 2
        exponente += 1

    print(f"La potencia de 2 mas proxima sin pasarse es: 2^{exponente} = {potencia}")

if __name__ == '__main__':
    potenciadedos()