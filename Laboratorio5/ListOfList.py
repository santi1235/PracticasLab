if __name__ == '__main__':
    inputt = input("Ingresa palabras separadas por espacios: ")
    words = inputt.split()
    print("Lista de palabras:", words)

    ListOfList = list(map(list, words))
    print(ListOfList)