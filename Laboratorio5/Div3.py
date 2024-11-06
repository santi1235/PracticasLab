if __name__ == '__main__':
    lis = [0,1,2,3,4,5,6,7,8,9]
    print(lis)

    lista = list(filter(lambda x: x%3 == 0, lis))
    print(lista)