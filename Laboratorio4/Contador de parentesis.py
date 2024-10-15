paren = 0
def contadorParen():
    global paren
    paren += 2

def contador(arr):
    tamaño = len(arr)
    if 0 <= tamaño <= 3*(pow(10,4)):
        for i in range(tamaño - 1):
            if arr[i] == "(" and arr[i+1] == ")":
                contadorParen()
    print(paren)

if __name__ == '__main__':
    arr = input("Ingrese la cadena de ( y ): ")
    contador(arr)