def DupTri(lista):
    tamanio = len(lista)
    for i in range(tamanio):
        if lista[i]%2 == 0:
            lista[i] = lista[i]*2
        else:
            lista[i] = lista[i]*3

if __name__ == '__main__':
    lis = [0,1,2,3,4,5,6,7,8,9]
    print(lis)
    DupTri(lis)
    print(lis)