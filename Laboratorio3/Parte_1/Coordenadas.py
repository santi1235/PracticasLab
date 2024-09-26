
x = int(input("Ingrese el valor para X: "))
y = int(input("Ingrese el valor para Y: "))

def cuadrantes(x,y):
    if x > 0 and y > 0:
        print(f"Las coordenadas ({x},{y}) se encuentran en el cuadrante 1")
    elif x > 0 and y < 0:
        print(f"Las coordenadas ({x},{y}) se encuentran en el cuadrante 4")
    elif x < 0 and y < 0:
        print(f"Las coordenadas ({x},{y}) se encuentran en el cuadrante 3")
    elif x < 0 and y > 0:
        print(f"Las coordenadas ({x},{y}) se encuentran en el cuadrante 2")
    else:
        print("Las coordenadas son en el origen (0,0)")

if __name__ == '__main__':
    cuadrantes(x,y)