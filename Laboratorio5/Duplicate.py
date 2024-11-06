def dupli(lista):
    tamanio = len(lista)
    for i in range(tamanio):
        lista[i] = lista[i]*2

if __name__ == '__main__':
    lis = [5,3,6,7,1]
    print(lis)
    dupli(lis)
    print(lis)