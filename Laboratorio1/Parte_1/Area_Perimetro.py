import math

while True:
    print("0.- Area y perimetro de cuadrado")
    print("1.- Area y perimetro de pentagono")
    print("2.- Area y perimetro de circulo")
    print("3.- Area y perimetro de triangulo")
    print("4.- Area y perimetro de rectangulo")
    print("5.- Exit")

    Option = int(input("Ingresa una opcion: "))

    if Option == 0:
        lado1 = float(input("Ingresa el valor en metros del lado del cuadrado:"))

        Area = math.pow(lado1, 2) * 10000   #Multiplicar por 10,000 para la conversion de metros cuadrados a centimetros cuadrados
        Perimetro = 4 * lado1 * 100         #Multiplicar por 100 para la conversion de metros a centimetros

        print("El area del cuadrado es: ", Area, " cm^2")
        print("El perimetro del cuadrado es: ", Perimetro, " cm")
    elif Option == 1:
        lado1 = float(input("Ingresa el valor en metros del lado del pentagono:"))
        apotema = float(input("Ingresa el valor en metros del apotema del pentagono:"))

        Area = (((5 * lado1) * apotema)/2) * 10000
        Perimetro = 5 * lado1 * 100

        print("El area del pentagono es: ", Area, " cm^2")
        print("El perimetro del pentagono es: ", Perimetro, " cm")
    elif Option == 2:
        radio = float(input("Ingresa el valor en metros del radio del circulo:"))

        Area = math.pi * math.pow(radio, 2) * 10000
        Perimetro = math.pi * (2 * radio) * 100

        print("El area del circulo es: ", Area, " cm^2")
        print("El perimetro del circulo es: ", Perimetro, " cm")
    elif Option == 3:
        lado1 = float(input("Ingresa el valor en metros del lado del triangulo equilatero:"))

        Area = (math.pow(lado1,2) * math.sqrt(3))/4 * 10000
        Perimetro = 3 * lado1 * 100

        print("El area del triangulo es: ", Area, " cm^2")
        print("El perimetro del triangulo es: ", Perimetro, " cm")
    elif Option == 4:
        lado1 = float(input("Ingresa el valor en metros del lado pequeno del rectangulo:"))
        lado2 = float(input("Ingresa el valor en metros del lado grande del rectangulo:"))

        Area = lado1*lado2*10000;
        Perimetro = ((2*lado1)+(2*lado2))*100;

        print("El area del cuadrado es: ", Area, " cm^2")
        print("El perimetro del cuadrado es: ", Perimetro, " cm")
    elif Option == 5:
        print("Cerrando programa")
        break
    else:
        print("No existe esa opcion")
        break